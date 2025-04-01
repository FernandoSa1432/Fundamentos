/*Cargar un arreglo de 10 posiciones con los primeros 10 elementos
de la serie de Fibonacci y mostrarlo en pantalla */

fun main(){
    val fibonacci = IntArray(10)

    //Se genera la secuencia de fibonacci
    for (i in fibonacci.indices){
        when(i){
            0 -> fibonacci[i] = 0 //Primer elemento es 0
            1 -> fibonacci[i] = 1 //Segundo elemento es 1
            else -> fibonacci[i] = fibonacci[i-1] + fibonacci[i-2] //Los demas son suma de los dos anteriores

        }
    }

    //Aqui se muestra el arreglo
    println("Los primeros 10 numeros de Fibonacci son:")
    for (num in fibonacci){
        print("$num, ")
    }
}