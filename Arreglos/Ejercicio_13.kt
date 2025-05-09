/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar si el promedio
entero de estos datos esta almacenado dentro del arreglo */

import kotlin.io.readln
fun main(){
    val numeros = IntArray(10)
    println("Ingresa el valor de los numeros")
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        numeros[i] = readln().toInt()
    }   

    var suma = 0

    for(i in numeros.indices){
        suma += numeros[i]
    }
    val promedio = suma / 10
    for(i in numeros.indices){
        if(numeros[i] == promedio){
            println("El valor ${numeros[i]} esta dentro del arreglo")
        }
    }

    println("\nArreglo: ${numeros.contentToString()}")
}