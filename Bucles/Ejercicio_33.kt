/*Si  32768  es  el  tope  superior  para  los  números  entero  cortos,  determinar  cuál  es  el  número  primo 
mas cercano por debajo de él */

fun main(){
    var temp = 0
    var primoMayor = 0
    for(numero in 1..32768){
        if(estoEsPrimo(numero)){
            primoMayor = numero
            if(primoMayor < numero){
                temp = primoMayor
                primoMayor = numero
            }
        }
    }

    println("Este es el numero primo mas cercano a 32768: $primoMayor")
}

fun estoEsPrimo(numero: Int): Boolean{
    if (numero <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}