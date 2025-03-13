/*Leer numeros hasta que digiten 0 y determinar a cuanto es igual el promedio entero
de los numeros primos leidos */
//Ejercicio 28
fun main(){
    var suma:Double = 0.0
    var contador = 0

    while(true){
        var numero = readln().toInt()

        if(numero == 0){
            break
        }
        else if(numPrimo(numero)){
            suma += numero
            contador++

        }

    }

    println("EL promedio de los numeros primos es: ${suma/contador}")



}


fun numPrimo(digito: Int):Boolean{
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
