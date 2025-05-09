/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar en que posiciones estan
los numeros positivos */


fun main(){
    println("Ingresa el valor de los numeros")

    var numeros = IntArray(10) { 0 }

    for(num in numeros.indices){
        println("Ingresa el valor del numero: ${num+1}")
        numeros[num] = readln().toInt()
    }


    println("Los numeros positivos se encuentran en esta posicion del arreglo:")
    for(num in numeros.indices){
        if(numeros[num] > 0){
            print(" ,${num+1}")
        }
    }


    println("\nEste es el arreglo original: ${numeros.contentToString()}")
}