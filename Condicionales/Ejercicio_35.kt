/*Los archivos kts no generan un archivo .jar y se ejecutan de manera directa

se ejecutan con kotlinc -script (nombre del ejercicio).kts"*/


/*Leer un numero entero de dos digitos, guardar cada digito en una variable diferente y luego mostrarlas en pantalla */


fun main(){
    println("Ingresa el valor del numero")
    val numero = readLine()!!.toInt()

    if(numero >= 10 && numero < 100){
        val unidades = numero % 10
        val decenas = numero / 10

        println("El numero $numero tiene como decenas $decenas y como unidades $unidades")
    }
    else{
        println("El numero $numero no es un numero valido")
    }

}