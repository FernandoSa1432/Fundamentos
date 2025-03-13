/*Leer 2 numeros enteros y determinar cual de los dos tiene mayor
cantidad de digitos primos */

fun main(){
    println("Ingresa el valor del primer numero")
    var numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    var numero2 = readln().toInt()

    var digito:Int
    var contador1 = 0
    var contador2 = 0

    while(numero1 > 0){
        digito = numero1 % 10
        numero1 /= 10

        if(esPrimo(digito)){
        
            contador1++
        }
    }

    while(numero2 > 0){
        digito = numero2 % 10
        numero2 /= 10

        if(esPrimo(digito)){
            contador2++
        }

    }

    if (contador1 > contador2) {
        println("El numero 1 tiene mayor cantidad de digitos primos")
    } else if (contador2 > contador1) {
        println("El numero 2 tiene mayor cantidad de digitos primos")
    } else {
        println("Ambos numeros tienen la misma cantidad de digitos primos")
    }


}


fun esPrimo(digito: Int): Boolean {
    if (digito <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(digito.toDouble()).toInt()) {
        if (digito % i == 0) {
            return false
        }
    }
    return true
}