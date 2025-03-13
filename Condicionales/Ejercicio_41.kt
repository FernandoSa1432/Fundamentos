/*Leer dos numeros enteros y determinar si la diferencia entre los dos es un numero primo */

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readLine()!!.toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readLine()!!.toInt()


    var diferencia = 0

    if(numero1 > numero2){
        diferencia = numero1 - numero2
    }
    if(numero2 > numero1){
        diferencia = numero2 - numero1
    }


    //Esto es para la logica de identificar si es un numero primo
    var esPrimo = true

    if(diferencia < 2){
        esPrimo = false
    }
    else{
        for(i in 2 until diferencia){
            if(diferencia % i == 0){
                esPrimo = false
                break
            }
        }
    }


    //Esto se utiliza para imprimir el resultado
    if(esPrimo){
        println("La diferencia entre $numero1 y $numero2 es un numero primo     DIFERENCIA: $diferencia")
    }
    else{
        println("La diferencia entre $numero1 y $numero2 no es un numero primo    DIFERENCIA: $diferencia")
    }
}