/*Leer dos numeros enteros y determinar si la diferencia entre los dos es un numero par */

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()


    var diferencia = numero1 - numero2

    if(diferencia % 2 == 0){
        println("La diferencia entre los dos numeros es un numero par  $diferencia")
    }
    else{
        println("La diferencia entre los dos numeros no es un numero par $diferencia")
    }



}