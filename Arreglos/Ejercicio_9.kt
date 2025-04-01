/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar cuantas
veces esta repetido el mayor */

fun main(){
    val numeros = IntArray(10)
    println("Ingresa el valor de los 10 numeros")
    
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        numeros[i] = readln().toInt()
    }

    var maxNum = 0
    var contador = 0
    for(i in numeros.indices){
        if(maxNum < numeros[i]){
            maxNum = numeros[i]
        }
    }
    for(i in numeros.indices){
        if(maxNum == numeros[i]){
            contador++
        }
    }

    println("El numero maximo $maxNum se repite: $contador veces")
    println("Este es el arreglo completo:\n${numeros.contentToString()}")

}

