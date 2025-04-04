/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar a cuanto es igual el
promedio entero de los datos del arreglo  */

fun main(){
    println("Ingresa el valor de los numeros:")

    val numeros = IntArray(10)
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        numeros[i]=readln().toInt()
    
    }

    var suma = 0
    for(i in numeros.indices){
        suma += numeros[i]
    }

    println("El promedio de los valores del arreglo es de: ${suma/10}")

}