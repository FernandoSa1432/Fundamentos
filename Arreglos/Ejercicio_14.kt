/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar cuantas veces
se repite el promedio entero de los datos del vector */


import kotlin.io.readln

fun main(){

    println("Ingresa el valor de los numeros")
    val numeros = IntArray(10) { 0 }

    for(i in numeros.indices){
        println("Valor del numero ${i+1}")
        numeros[i] = readln().toInt()
    }

    var suma = 0
    for(i in numeros.indices){
        suma += numeros[i]
    }
    var promedio = suma / 10
    var contador = 0

    for(i in numeros.indices){
        if(numeros[i] == promedio){
            contador++
        }
    }

    println("El promedio es de: $promedio")
    println("Este numero se repite $contador veces dentro del arreglo")
    println("${numeros.contentToString()}")

}
