/*Leer un numero entero de tres digitos y mostrar todos los enteros comprendidos
entre 1 y cada uno de los digitos */


fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    if(numero > 99 && numero < 999){
        val unidades = numero % 10
        val decenas = numero / 10 % 10
        val centenas = numero / 100


        println("Estos son los numeros comprendidos entre 1 y cada uno de los digitos")

        println("Serie del digito $unidades")
        for(num in 1..unidades){
            println("$num")
        }

        println("Serie del digito $decenas")
        for(num in 1..decenas){
            println("$num")
        }

        println("Serie del digito $centenas")
        for(num in 1..centenas){
            println("$num")
        }
    }
    else{
        return
    }

    
}