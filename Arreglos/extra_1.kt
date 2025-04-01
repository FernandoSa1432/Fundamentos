/*Dado un arreglo de numeros, encuentra y muestra el valor mas grande */

fun main(){
    val numeros = intArrayOf(22, 18, 25, 20, 17, 23)

    var numMax = 0
    for(i in numeros.indices){
        if(numMax < numeros[i]){
            numMax = numeros[i]
        }
    }

    println("El numero maximo del arreglo es: $numMax")


}