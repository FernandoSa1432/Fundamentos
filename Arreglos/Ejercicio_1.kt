/*Leer 10 enteros, almacenarlos en un arreglo y determinar en que posicion del arreglo esta el numero
mayor leido */

import kotlin.io.readln

fun main(){
 
    //Se crea un arreglo para poder almacenar 10 enteros
    val numeros = IntArray(10)

    println("Ingresa 10 numeros enteros:")
    for(i in numeros.indices){
        print("Numero ${i + 1}:")
        numeros[i] = readLine()!!.toInt()
    }

    //Aqui encuentra el numero mayor y su posicion
    var maximo = numeros[0]
    var posicion = 0

    for(i in numeros.indices){
        if(numeros[i] > maximo){
            maximo = numeros[i]
            posicion = i
        }
    }
    

    println("\nEl numero mayor es $maximo y esta en la posicion $posicion (indice base 0)")
}