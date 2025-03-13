/*Leer un numero entero de 2 digitos y si es par mostrar en pantalla la suma de sus digitos, si es primo
y menor que 10 mostrar en pantalla su ultimo digito y si es multiplo de 5 y menor que 30 mostrar en pantalla
el primer digito */
package misFunciones

fun main(){
    println("Ingresa el valor del numero")

    val numero = readln().toInt()

    if(numero < 10 && numero > 100){

        return
    }
    else{
        if(numero % 2 == 0){
            println("El numero se trata de un numero par")
            val primerDigito = numero / 10
            val segundoDigito = numero % 10
            val sumaDigitos = primerDigito + segundoDigito
            println("La suma de los digitos de $numero es $sumaDigitos")
        }
        if(esPrimo(numero) && numero < 10){
            println("El numero es primo y es menor que 10")
            val segundoDigito = numero % 10
            println("El ultimo digito del numero $numero es: $segundoDigito")
        }
        if(numero % 5 == 0 && numero < 30){
            println("El numero es multiplo de 5 y menor que 30")
            val primerDigito = numero / 10
            println("El primer digito del numero $numero es $primerDigito")
        }
    }


}


//Funcion para saber si un numero es primo
fun esPrimo(numero:Int): Boolean{
    if(numero <= 1){
        return false
    }
    for(i in 2..Math.sqrt(numero.toDouble()).toInt()){
        if(numero % i == 0){
            return false
        }
    }

    return true
}