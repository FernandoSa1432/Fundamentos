/*Leer dos numeros enteros y determinar si la diferencia entre los dos numeros es un divisor exacto de alguno de los dos numeros */
import kotlin.math.abs

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()


    //Esto es para conseguir el valor absoluto y que no se creen valores negativos 
    var diferencia = numero1 - numero2
    diferencia = abs(diferencia)

    if(numero2 % diferencia == 0 && numero2 % diferencia == 0){
        println("$diferencia es un divisor exacto de $numero1 y de $numero2")
    }
    else{
        if(numero1 % diferencia == 0){
            println("$diferencia es un divisor exacto de $numero1")
        } 
        if(numero2 % diferencia == 0){
            println("$diferencia es un divisor exacto de $numero2")
        }
        else{
            println("Ningun numero es un divisor exacto")
        }
    }

    
    

}