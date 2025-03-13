

import kotlin.text.toInt/*Leer un numero entero de 5 digitos y determinar si es un numero capicuo.
Ejemplo: 15651, 59895*/

fun main(){
 
    
    println("Ingresa un numero de 5 digitos")
    //!! -> significa que el valor no puede ser nulo
    val numero = readLine()!!.toInt()

    val quintoDigito = numero % 10
    val cuartoDigito = numero / 10 % 10
    //val tercerDigito = numero / 100 % 10
    val segundoDigito = numero / 1000 % 10
    val primerDigito = numero / 10000

    //12421
    if(primerDigito == quintoDigito && segundoDigito == cuartoDigito){
        println("El numero $numero es un capicuo")
    }
    else{
        println("El numero $numero no es un capicuo")
    }
}