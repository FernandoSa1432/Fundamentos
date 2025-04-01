import kotlin.io.readln

/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar en que posiciones se encuentran los numeros
terminados en 4 */

fun main(){
    val numeros = IntArray(10)
    println("Ingresa el valor de los 10 numeros")

    for(i in numeros.indices){
        println("Ingresa el valor del numero: ${i + 1}")
        numeros[i] = readln().toInt()
    }
    
    println("Estos son las posiciones de los numeros del arreglo los cuales terminan en 4")
    for(i in numeros.indices){
        if(numeroTerminaEn4(numeros[i])){
            print("$i,")
        }
    
    }
    println("\nEste es el arreglo final: ${numeros.contentToString()}")

}

fun numeroTerminaEn4(Numero:Int): Boolean{
    if(Numero % 10 == 4){
        return true
    }
    return false

}