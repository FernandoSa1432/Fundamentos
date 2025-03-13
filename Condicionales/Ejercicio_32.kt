/*Leer un numero entero y determinar si es multiplo de 7 */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readLine()!!.toInt()

    if(numero % 7 == 0){
        println("El numero es multiplo de 7")
    }
    else{
        println("El numero no es multiplo de 7")
    }
}