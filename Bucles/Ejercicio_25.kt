/*Leer un numero entero y determinar a cuanto es igual el promedio
entero de sus digitos */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var suma:Int = 0
    var digito:Int
    var contador:Int = 0

    while(numero > 0){
        digito = numero % 10
        suma += digito
        numero /= 10
        contador++
    }

    println("El promedio de la suma de los digitos del numero es:")
    print(suma/contador.toDouble())

}