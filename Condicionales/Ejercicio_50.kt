/*Leer un numero entero y si es multiplo de 4 mostrar en pantalla su mitad
Si es multiplo de 5 mostrar en pantalla su cuadrado
y si es multiplo de 6 mostrar en pantalla su primer digito
Asumir que el numero no es mayor a 100 */

fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    if(numero % 4 == 0){
        println("La mitad del numero $numero es: ${numero/2}")
    }
    if(numero % 5 == 0){
        println("El cuadrado del numero $numero es: ${numero*numero}")
    }
    if(numero % 6 == 0){
        println("El primer digito del numero $numero es: ${numero/10}")
    }
    

}