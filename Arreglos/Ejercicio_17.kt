/*Leer 10 numeros enteros, almacenarlos en un arreglo y determinar
cuantos numeros negativos hay */



fun main(){
    println("Ingresa el valor de los numeros")
    var numeros = IntArray(10) {0}
    var contador = 0

    for(num in numeros.indices){
        println("Valor del numero ${num+1}")
        numeros[num] = readln().toInt()
    }

    for(num in numeros.indices){
        if(numeros[num] < 0){
            contador++
        }
    }

    println("El arreglo tiene ${contador} numeros negativos")

    println("Este es el arreglo original: ${numeros.contentToString()}")

}