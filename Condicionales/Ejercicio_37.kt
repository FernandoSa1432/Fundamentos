/*Leer dos numeros enteros y deteminar cual es multiplo de cual */

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()

    if(numero1 % numero2 == 0){
        println("$numero1 es multiplo de $numero2")
    }
    if(numero2 % numero1 == 0){
        println("$numero2 es multiplo de $numero1")
    }
    else{
        println("Ninguno es multiplo del otro")
    }

}