/*Leer un numero y calcular su factorial */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()
    var factorial = 1

    for(i in 1..numero){
        factorial *= i
    }
    
    println("El factorial de $numero es $factorial")
}

//4! = (4)(3)(2)(1) = 24