/*Escribir en pantalla el resultado de sumar los primeros
20 multiplos de 3 */

fun main(){
    var suma = 0
    var multiplo = 0
    for(num in  1..20){
        multiplo += 3
        println(multiplo)
        suma += multiplo
    }

    println("La suma total es de: $suma")

}