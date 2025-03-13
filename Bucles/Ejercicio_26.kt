/* Leer un numero entero y determinar cual es el mayor de sus digitos */

fun main() {
    println("Ingresa el valor del numero")
    val numero = readln().toInt()
    var temp = numero
    var digitoMayor = 0

    while (temp > 0) {
        val digito = temp % 10

        if (digito > digitoMayor) {
            digitoMayor = digito
        }

        temp /= 10
    }

    println("El digito mayor del numero es: $digitoMayor")
}