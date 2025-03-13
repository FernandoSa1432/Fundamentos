/*Leer dos numeros enteros y determinar a cuanto es igual el producto mutuo
del primer digito de cada uno */

fun main(){
    println("Ingresa el valor del primer numero")
    var numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    var numero2 = readln().toInt()

    val digitonum1 = numero1 % 10
    val digitonum2 = numero2 % 10

    print("El producto es: ${digitonum1 * digitonum2}")
}