/*Pide al usuario un numero y verifica si esta presente
en un arreglo predefinido */

fun main(){
    val valores = intArrayOf(5, 10, 15, 20, 25)
    println("Ingresa un numero a buscar")
    var numero = readln().toInt()
    var encontrado = false

    for(i in valores.indices){
        if(numero == valores[i]){
            encontrado = true
        }
    }

    if(encontrado){
        println("El numero $numero esta dentro del arreglo")
    }
    else{
        println("El numero $numero NO se encuentra dentro del arreglo")
    }
}