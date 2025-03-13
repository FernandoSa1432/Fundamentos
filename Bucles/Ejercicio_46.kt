/*Leer un numero y calcular el promedio entero de los factoriales de los enteros
comprendidos entre 1 y el numero leido */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var factorial = 1
    var contador = 0

    for(valor in 1..numero){
        factorial *= valor
        contador++
    }

    println("El promedio entero de los factoriales es: ${factorial/contador}")

}