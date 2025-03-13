/*Leer un numero entero y determinar a cuanto es igual la suma
de sus digitos pares */


fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()
    var digito:Int
    var suma = 0


    while(numero > 0){
        digito = numero % 10
        numero /= 10

        if(digito % 2 == 0){
            suma += digito
        }

    }

    println("Esta es la suma de los digitos pares del numero $suma")
}