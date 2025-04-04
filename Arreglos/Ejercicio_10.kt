/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar en que posiciones se encuentran
los numeros con mas de tres digitos */

fun main(){
    val numeros = IntArray(10)

    for(i in numeros.indices){
        println("Ingresa el valor del numero: ${i + 1}")
        numeros[i] = readln().toInt()
    }


    println("Estas son las posiciones donde se encuentran los numeros con mas de 3 digitos:")
    for(i in numeros.indices){
        var num = numeros[i]
        var digitos = 0

        while(num != 0){
            num /= 10
            digitos++
        }
        

        if(digitos > 3){
            print("${i+1}, ")
        }
    }

    println("\nArreglo: ${numeros.contentToString()}")

}