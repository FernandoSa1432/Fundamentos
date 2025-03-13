/*Leer un numero entero y si es menor que 100 determinar si es primo */



fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    if(numero < 100){
        if(EsPrimo(numero)){
            println("El numero $numero es primo")
        }
        else{
            println("El numero $numero no es primo")
        }
    }
    else{
        println("El numero es mayor que 100")
    }

}   

fun EsPrimo(numero:Int): Boolean{
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