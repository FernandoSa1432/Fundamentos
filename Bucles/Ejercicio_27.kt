/*Leer 2 numeros enteros y determinar cual de los dos tiene mayor cantidad de digitos */

fun main(){
    println("Ingresa el valor del numero 1")
    var numero1 = readln().toInt()

    println("Ingresa el valor del numero 2")
    var numero2 = readln().toInt()

    var contador1 = 0
    var contador2 = 0

    while(numero1 > 0){
        numero1 /= 10
        contador1++
    }

    while(numero2 > 0){
        numero2 /=10
        contador2++

    }

    if(contador1 >  contador2){
        println("El numero 1 tiene mas digitos")
    }
    if(contador2 > contador1){
        println("El numero 2 tiene mas digitos")
    }

}