/*Leer dos numeros enteros y mostrar todos los multiplos de
5 comprendidos entre el menor y el mayor */

fun main(){
    println("Ingresa el valor del primer numero")
    var numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    var numero2 = readln().toInt()

    var temp:Int

   

    if(numero1 < numero2){
        temp = numero1
        numero1 = numero2
        numero2 = temp
    }


    println("Esta es lista de multiplos comprendidos entre $numero1 y $numero2")
    for(multiplos in numero2..numero1){
        if(multiplos % 5 == 0){
            println(multiplos)
        }
    }

    

}