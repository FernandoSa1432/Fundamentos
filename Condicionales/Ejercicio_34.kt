/*Leer un numero entero menor que mil y determinar cuantos digitos tiene */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readLine()!!.toInt()

    if(numero < 1000){
        if(numero < 10){
            println("El numero tiene 1  digito")
        }
        if(numero >= 10 && numero < 100){
            println("El numero tiene 2 digitos")
        }
        if(numero >=100 && numero < 1000){
            println("El numero tiene 3 digitos")
        }
    }
    else{
        println("El numero $numero no es menor que 1000")
    }
    

}