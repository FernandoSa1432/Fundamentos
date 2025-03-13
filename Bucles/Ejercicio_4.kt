/*Leer dos numeros y mostrar todos los enteros comprendidos entre ellos */

fun main(){
    println("Ingresa el valor del primer numero")
    var numero1 = readln().toInt()

    println("Ingresa el valor del primer numero")
    var numero2 = readln().toInt()

    println("Valores del primer numero")
    for(primeros_valores in 1..numero1){
        println("$primeros_valores")
    }
    println("Valores del segundo numero")
    for(segundos_valores in 1..numero2){
        println("$segundos_valores")
    }
}