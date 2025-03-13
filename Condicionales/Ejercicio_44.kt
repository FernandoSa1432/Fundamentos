/*Leer un numero entero de 4 digitos y determinar si el primer digito es multiplo
de alguno de los otros digitos */


fun main(){

    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    if(numero>999 || numero < 10000){
        val primerDigito = numero / 1000
        
        val segundoDigito = numero / 100 % 10
        val tercerDigito = numero / 10 % 10
        val cuartoDigito = numero % 10


        println("Primer digito: $primerDigito, Segundo digito: $segundoDigito, Tercer digito: $tercerDigito, Cuarto digito: $cuartoDigito")
        
        if(segundoDigito % primerDigito == 0){
            println("El segundo digito $segundoDigito es multiplo de $primerDigito")
        }
        if(tercerDigito % primerDigito == 0){
            println("El tercer digito $tercerDigito es multiplo de $primerDigito")
        }
        if(cuartoDigito % primerDigito == 0){
            println("El cuarto digito $cuartoDigito es multiplo de $primerDigito")
        }
        else{
            println("Ninguno de los digitos es multiplo de $primerDigito")
        }
    }else{
        return
    }

}