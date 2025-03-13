/*Utilizando ciclos aninados generar las siguientes parejas de enteros */

fun main(){

    for(primeraColumna in 0..10 step(2)){

        for(segundaColumna in 1..2){

            var segundoDigito = primeraColumna / 2 + 1
            println("${primeraColumna + segundaColumna} $segundoDigito")
        }


    }
}