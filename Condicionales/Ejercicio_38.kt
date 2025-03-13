/*Leer tres numeros enteros y determinar si el ultimo digito de los tres numeros es igual */

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()

    println("Ingresa el valor del tercer numero")
    val numero3 = readln().toInt()


    if(numero1 % 10 == numero2 % 10 && numero2 % 10 == numero3 % 10){
        println("El ultimo digito de los tres numeros es igual")
    }
    else{
        println("El ultimo digito de los tres numeros no es igual")
    }
}