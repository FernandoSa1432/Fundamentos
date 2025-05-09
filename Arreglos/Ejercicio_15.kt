/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar cuantos datos
son multiplos de 3 */

fun main(){
    val numeros = IntArray(10) { 0 }
    println("Ingresa el valor de los numeros")
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        numeros[i] =  readln().toInt()
    }

    var contador = 0
    print("Multiplos: ")
    for(i in numeros.indices){
        if(numeros[i] % 3 == 0){
            contador++
            print("${numeros[i]},")
        }
    }

    println("\n$contador numeros son multiplos de 3")
    println("Arreglo: ${numeros.contentToString()}")
}