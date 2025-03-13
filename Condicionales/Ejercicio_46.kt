/*Leer un numero entero de 2 digitos y si terminar en 1 mostrar en pantalla su primer digito 
si termina en 2 mostra en pantalla la suma de sus digitos y si termina en 3 mostrar en 
pantalla el producto de sus dos digitos*/


fun main(){
    println("Ingresa el valor del numero")
    val numero = readln().toInt()

    if(numero < 10 && numero > 100){
        println("El numero debe de ser de dos digitos")
        return
    }
    else{
        val primerDigito = numero / 10
        val segundoDigito = numero % 10

        if(segundoDigito == 1){
            println("El numero termina en 1")
            println("Su primer digito es: $primerDigito")
        }
        if(segundoDigito == 2 ){
            println("El numero termina en 2")
            val suma = primerDigito + segundoDigito
            println("La suma de los digitos de $numero es: $suma")
        }
        if(segundoDigito == 3){
            println("El numero termina en 3")
            val producto = primerDigito * segundoDigito
            println("EL producto de los digitos del numero $numero es: $producto")
        }
        else{
            println("El numero no termina ni con 1, ni con 2, ni con 3")
        }
    }

}


