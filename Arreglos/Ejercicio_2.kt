/*Leer 9 enteros, almacenados en un arreglo y determinar en que posicion
del arreglo esta el mayor numero par leido */
import kotlin.io.readLine
import kotlin.text.toInt

fun main(){
    val numeros = IntArray(10)
   
    //Introducir valores
    println("Introduce el valor de los numeros")
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        //!! es para que no haga valores nulos
        numeros[i] = readLine()!!.toInt()
    }

    var parMayor: Int? = null //Se inicializa como null en caso de que no se ingrese ningun numero par
    var posicion = -1

    for(i in numeros.indices){
        val numeroActual = numeros[i]
        //Verificamos que el numero sea par
        if (numeroActual % 2 == 0 && (parMayor == null || numeroActual > parMayor)) {
            parMayor = numeroActual
            posicion = i
        }
    }

    println("El numero par mayor es $parMayor y esta en la posicion $posicion (indice base 0)")

}

