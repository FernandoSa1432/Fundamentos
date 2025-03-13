/*Determinar  a  cuánto  es  igual  el  promedio  entero  de  los  elementos  de  la  serie  de  Fibonacci  entre 0 y 1000 */

fun main(){
    var a = 0
	var b = 1
    var total = 0
    var contador = 0
	while (a <= 1000) {
		print("$a ")
		val sum = a + b
        total += a
		a = b
		b = sum
        contador++
        
	}

    println("\nEl promedio es ${total / contador}")


}