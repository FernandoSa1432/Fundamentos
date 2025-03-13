/*Leer un numero entero y mostrar todos los divisores exactos del numero, comprendidos entre 1
y el numero leido*/

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    for(num in 1..numero){
        if(numero % num == 0){
            println("$num es un divisor exacto de $numero")
        }
    }

}