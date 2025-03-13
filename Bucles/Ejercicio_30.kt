/*Leer un numero entero y mostrar todos sus componentes numericos o sea aquellos
para quienes el sea un multiplo */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    println("El numero $numero es multiplo de:")
    for(multiplo in 1..numero){
        if(numero % multiplo == 0){
            println(multiplo)
        }
    }

}