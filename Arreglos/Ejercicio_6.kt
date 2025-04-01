/*Leer dos numeros enteros y almacenar en un arreglo los 10 
primeros nuemros primos comprendidos entre el menor y el mayor
luego mostrarlos en pantalla*/

fun main(){
    println("Ingresa el valor del primer numero:")
    val numero1 = readln().toInt()

    println("ingresa el valor del segundo numero:")
    val numero2 = readln().toInt()

    val numMin = minOf(numero1, numero2)
    val numMax = maxOf(numero1, numero2)

    val numeros = IntArray(10)
    var contador = 0

    for(i in numMin..numMax){
        if(esUnNumeroPrimo(i)){
            if(contador < 10){
                numeros[contador] = i
                contador++
            }
            else{
                break
            }
        }
    }
    
    println("Los 10 numeros primos comprendidos entre $numMin y $numMax son: ${numeros.contentToString()}")
}

fun esUnNumeroPrimo(numero:Int): Boolean{
    if(numero <= 1){
        return false
    }
    for(i in 2..Math.sqrt(numero.toDouble()).toInt()){
        if(numero % i == 0){
            return false
        }
    }
    return true
}


