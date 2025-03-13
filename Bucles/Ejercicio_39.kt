/*Se define la serie de Fibonacci como la serie que comienza con los dígitos 1 y 0 y va sumando progresivamente los dos últimos elementos de la serie, así:0112358132134......
.Utilizando  el  concepto  de  ciclo  generar  la  serie  de  Fibonacci  hasta  llegar  o  sobrepasas  el  número  10000 */

fun main() {
	var a = 0
	var b = 1
	while (a <= 10000) {
		print("$a ")
		val sum = a + b
		a = b
		b = sum
	}
    
}