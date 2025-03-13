/*Determinar a cuanto es igual la suma de los elementos de la serie
de Fibonnacci entre 0 y 100 */

fun main(){
    var a = 0
	var b = 1
    var total = 0
	while (a <= 100) {
		print("$a ")
		val sum = a + b
        total += a
		a = b
		b = sum
        
	}

    println("\nEl total de la suma de la serie es: $total")
    
}