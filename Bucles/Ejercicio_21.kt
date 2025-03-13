/*Leer un numero entero y determinar a cuanto es igual la suma
de sus digitos */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    val copiaNumero = numero
    var suma:Int = 0

    while(numero > 0){
        suma += numero % 10
        numero = numero / 10
        
    }

    println("La suma de los digitos del numero: $copiaNumero es $suma")

}