/*Leer un numero entero y determinar a cuanto es igual el primero de sus digitos */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    val digito = numero % 10

    println("El primer digito es: $digito")
}