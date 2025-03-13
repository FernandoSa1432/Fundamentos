/*Generar todas las tablas de multiplicar del 1 al 10 */

fun main(){
    var numero = 0
    for(tabla in 1..10){
        numero = tabla
        println("Tabla del $tabla")
        
        for(multiplos in 1..10){
            println(numero)
             numero += tabla
             
        }

    }


}