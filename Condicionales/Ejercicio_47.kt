/*Leer dos numeros enteros y si la diferencia entre los dos numeros es par mostrar en pantalla
la suma de los digitos de los numeros, si dicha diferencia es un numero primo menor que 10 entonces mostrar
en pantalla el producto de los dos numeros y si la diferencia entre ellos termina en 4
mostrar en pantalla todos los digitos por separado */

import kotlin.math.abs


fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()

    var diferencia = abs(numero1 - numero2) 
    val primerDigitoNumero1 = numero1 % 10
    val segundoDigitoNumero1 = numero1 / 10
    val primerDigitoNumero2 = numero2 % 10
    val segundoDigitoNumero2 = numero2 / 10


    if(diferencia % 2 == 0){
        println("La diferenica de ambos numeros es par")
        val suma = primerDigitoNumero1 + segundoDigitoNumero1 + primerDigitoNumero2 + segundoDigitoNumero2
        println("La suma de los digitos de los numeros $numero1 y $numero2 es: $suma")
    }
    if(esPrimo(diferencia) && diferencia < 10){
        println("La diferencia de ambos numeros es un numero primo y es menor que 10")
        val producto = numero1 * numero2
        println("El producto de ambos numeros $numero1 y $numero2 es: $producto")

    }
    if(diferencia % 10 == 4 || diferencia == 4){
        println("La diferencia de ambos numeros termina en 4")
        println("Digitos de $numero1: Primer Digito: $primerDigitoNumero1, Segundo Digito: $segundoDigitoNumero1")
        println("Digitos de $numero2: Primer Digito: $primerDigitoNumero2, Segundo Digito: $segundoDigitoNumero2")
    }





}

