/*Leer tres numeros enteros y determinar si el penultimo digito de los tres numeros es igual */

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readln().toInt()

    println("Ingresa el valor del tercer numero")
    val numero3 = readln().toInt()

    if(numero1 < 100 || numero1 >= 1000 || numero2 < 100 || numero2 >= 1000 || numero3 < 100 || numero3 >= 1000){
        println("Alguno de los numeros no es de tres digitos")
        return
    }else{
        
        val penultimoDigito1 = numero1 / 10 % 10
        val penultimoDigito2 = numero2 / 10 % 10
        val penultimoDigito3 = numero3 / 10 % 10
        


        if(penultimoDigito1 == penultimoDigito2 && penultimoDigito2 == penultimoDigito3){
            println("El penultimo digito de los tres numeros es igual")
        }
        else{
            println("El penultimo digito de los tres numero no es igual")
        }
    }

}