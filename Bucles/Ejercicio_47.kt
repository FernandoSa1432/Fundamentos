/*Leer un numero entero y calcular a cuanto es igual la sumatoria
de todos los factoriales de los numeros comprendidos entre 1 y el numero leido */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var factorial = 0

    for(valor in 1..numero){
        factorial += valor
    }

    println("Suma de los factoriales: $factorial")
    7654321
    

}