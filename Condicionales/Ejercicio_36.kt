
/*Leer un numero entero de 4 digitos y determinar si tiene mas digitos pares o impares */

fun main(){
    println("Ingresa el valor del numero")
    //En caso de que el valor ingresado no sea un numero o sea nulo, se asigna -1
    val numero = readLine()?.toIntOrNull() ?: -1

    if(numero < 1000 || numero >= 10000){
        return
    }

    var impares = 0
    var pares = 0

    val primerDigito = numero / 1000
    val segundoDigito = numero / 100 % 10
    val tercerDigito = numero / 10 % 10
    val cuartoDigito = numero % 10

    if (primerDigito % 2 == 0) pares++ else impares++
    if (segundoDigito % 2 == 0) pares++ else impares++
    if (tercerDigito % 2 == 0) pares++ else impares++
    if (cuartoDigito % 2 == 0) pares++ else impares++

    if (pares > impares) {
        println("El número $numero tiene más dígitos pares que impares.")
    } else if (impares > pares) {
        println("El número $numero tiene más dígitos impares que pares.")
    } else {
        println("El número $numero tiene la misma cantidad de dígitos pares e impares.")
    }
}