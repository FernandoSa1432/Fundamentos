/*Crea un arreglo de 5 numeros enteros y calcula la suma de todos
sus elementos */

fun main(){
    var numeros = IntArray(5)

    var suma = 0

    //Introducir elementos al arreglo
    for(i in numeros.indices){
        println("Ingresa el valor del numero: ${i+1}")
        numeros[i] = readln().toInt()
    }

    for(i in numeros.indices){
        suma += numeros[i]
    }
    println("La suma total del arreglo es: $suma")

}