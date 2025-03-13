/*Mostrar en pantalla la tabla de multiplicar del numero 5 */

fun main(){
    var numero = 5

    println("Tabla de multiplicar del 5")
    for(numeros in 1..10){
        println(numero)
        numero = 5 * numeros
    }

}