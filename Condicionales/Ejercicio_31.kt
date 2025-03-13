/*Leer un numero entero y determinar si es igual a 10 */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readLine()!!.toInt()

    if(numero == 10){
        println("El numero es igual a 10")
    }
    else{
        println("El numero es distinto de 10")
    }

}