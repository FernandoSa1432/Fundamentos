/*Leer un numero entero y mostrar todos los enteros comprendidos entre 1 y el numero leido */

fun main(){

    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    for(num in 1..numero){
        println("$numero")
        numero--
    }
}