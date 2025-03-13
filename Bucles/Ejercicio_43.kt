/*Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000. */

fun main(){
    var a = 0
	var b = 1

    var contador = 0
	
    while (b <= 2000) {
        if (b >= 1000) {
            println("$b")
            contador++
        }
        val sum = a + b
        a = b
        b = sum
    }

    println("Numeros entre 1000 y 2000 $contador")
}