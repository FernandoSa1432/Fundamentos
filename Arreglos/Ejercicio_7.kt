/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar
en que posicion se encuentra el numero mayor */

fun main(){
    var numeros = IntArray(10)

    println("Ingresa el valor de los 10 numeros:")
    for(i in numeros.indices){
        print("Numeros ${i + 1}:")
        numeros[i] = readln().toInt()
    }

    var posicion = 0
    var valorMaximo = 0
    for(i in numeros.indices){
        if(valorMaximo < numeros[i]){
            valorMaximo = numeros[i]
            posicion = i
        }
    }

    println("El valor mas grande del arreglo es: $valorMaximo y esta en indice: $posicion")

    println("Arreglo: ${numeros.contentToString()}")

}


