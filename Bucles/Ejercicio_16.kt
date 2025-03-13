/*Mostrar en pantalla el promedio entero de los n primeros multiplos de 3 para un numero n leido */

fun main(){
    println("Ingresa la cantidad de multiplos que quieres generar")
    var numero = readln().toInt()
    var suma = 0
    var multiplos = 0
    

    for(num in 1..numero){
        multiplos += 3
        println(multiplos)
        suma+=multiplos
    }

    var promedio = suma / numero
    println("La suma de los multiplos es de: $suma")
    println("El promedio de la suma de los multiplos es de: $promedio")


}