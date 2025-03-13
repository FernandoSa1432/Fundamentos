/*Leer un numero entero y determinar cuantos digitos tiene */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var contador:Int = 0

    while(numero > 0){
        numero /= 10
        
        contador++
        

    }

    println("El numero tiene $contador digitos")

}