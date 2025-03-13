/*Leer un numero entero y determinar si termina en 7 */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readLine()!!.toInt()

    if(numero % 10 == 7){
        println("El numero $numero termina en 7")
    }
    else{
        println("El numero $numero no termina en 7")
    }
}