/*Leer un numero entero y mostrar todos los pares comprendidos entre 1 y el numero leido */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    println("Esta es la lista de numeros pares")
    for(num in 1..numero){
        if(num % 2 == 0){
            println(num)
        }
    }
}