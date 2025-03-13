/*Leer un numero entero de 2 digitos y determinar si pertenece a la serie de fibonnacci */

fun main(){
    println("Ingresa el valor del numero")
    var numero = readln().toInt()

    if(numero < 10 || numero > 99){
        println("El numero ingresado no es de dos digitos")
    }else{
        if(fibonnacci(numero)){
            println("El numero $numero pertenece a la serie de fibonnacci")
        }else{
            println("El numero NO pertenece a la serie de fibonnacci")
        }
    }

}

fun fibonnacci(numero:Int):Boolean{
    var a = 0
	var b = 1
    while (a <= numero) {
        if (a == numero) {
            return true
        }
        val sum = a + b
        a = b
        b = sum
    }
    return false
}