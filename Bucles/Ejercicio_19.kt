/*Leer un numero entero y determinar si es primo */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    var esPrimo = true

    if(numero <= 1){
        esPrimo = false
    }
    else{
        for(i in 2..Math.sqrt(numero.toDouble()).toInt()){
            if(numero % i == 0){
                esPrimo = false
            }
        }
    }

    println("El numero $numero es primo?: $esPrimo")
}