/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar cuantos
numeros tienen, de los almacenados ahi, tienen menos de 3 digitos */

fun main(){
    println("Ingresa el valor de los numeros")

    val numeros = IntArray(10)
    var contador = 0
    for(i in numeros.indices){
        println("Numero: ${i+1}")
        numeros[i] = readln().toInt()
    }


    for(i in numeros.indices){
        var num = numeros[i]
        var digitos = 0

        while(num != 0 ){
            num /= 10
            digitos++
        }

        if(digitos < 3){
            contador++
        }
    }

    println("$contador numeros tienen menos de 3 digitos")
    println("Arreglo: ${numeros.contentToString()}")
}