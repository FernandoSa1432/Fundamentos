/*Leer 10 enteros, almancenarlos en un arreglo y determinar en que posicion del arreglo esta el 
mayor numero primo leido */


fun main(){
    val numeros = IntArray(10)

    //Introducir los valores
    for(i in numeros.indices){
        println("Valor del numero: ${i+1}")
        numeros[i] = readln().toInt()
    }

    var NumMayor:Int? = 0
    var posicion = -1

    for(i in numeros.indices){
        val numeroActual = numeros[i]

        if(Primo(numeroActual)){
            if(NumMayor == null || numeroActual >  NumMayor){
                NumMayor = numeroActual
                posicion = i
            }
        }
    }

    println("El mayor numero primo es $NumMayor y esta en la posicion $posicion")
}

fun Primo(digito:Int):Boolean{
    if(digito <= 1){
        return false
    }
    for(i in 2..Math.sqrt(digito.toDouble()).toInt()){
        if(digito % i == 0){
            return false
        }
    }

    return true
}