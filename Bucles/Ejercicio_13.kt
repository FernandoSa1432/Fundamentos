/*Leer un entero y mostrar todos los multiplos de 5 comprendidos entre 1 
y el numero leido */

fun main(){

    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    for(num in 1..numero){
        if(num % 5 == 0){
            println(num)
        }
    }

}