/*Leer un numero entero y mostrar en pantalla su tabla de multiplicar */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var resultado = numero
    println("Tabla de multiplicar del $numero")
    for(multiplo in 1..10){
        resultado = multiplo * numero
        println(resultado)
    }

}