/*Leer un numero entero de cuatro digitos y determinar si el segundo digito es igual al penultimo */

fun main(){
    println("Ingresa el valor del numero de 4 digitos")
    val numero = readLine()!!.toInt()
    //1234    2 3
    
    val penultimoDigito = numero / 10 % 10
    val segundoDigito = numero / 100 % 10


    if(penultimoDigito == segundoDigito){
        println("El numero $numero tiene el segundo digito y el penultimo digito iguales")
    }
    else{
        println("El numero $numero no tiene el segundo digito y el penultimo digito iguales")
    }
}