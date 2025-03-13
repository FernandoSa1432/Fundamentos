/*Leer un numero entero y si es multiplo de 4 determinar
si su ultimo digito es primo */



fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    if(numero % 4 == 0){
        val ultimoDigito = numero % 10
        println(esUnPrimo(ultimoDigito))
    }
    else{
        println("El numero no es multiplo de 4")
    }

}

fun esUnPrimo(numero:Int): Boolean{
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