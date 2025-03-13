/*Leer dos numeros enteros y si la diferencia entre los dos es menor o igual a 10 entonces
mostrar en pantalla todos enteros comprendidos entre el menor y el mayor de los numeros leidos*/

fun main(){
    println("Ingresa el valor del primer numero")
    val numero1 = readLine()?.toInt()

    println("Ingresa el valor del segundo numero")
    val numero2 = readLine()?.toInt()


    if(numero1 != null && numero2 != null){
        if(numero1 - numero2 <= 10 || numero2 - numero1 <= 10){
            if(numero1 < numero2){
                println("Esta es la lista de los numeros entre $numero1 y $numero2")
                for(i in numero1..numero2){
                    print("$i, ")
                }
            }
            if(numero2 < numero1){
                println("Esta es la lista de los numeros entre $numero2 y $numero1")
                for(i in numero2..numero1){
                    print("$i, ")
                }
            }
        }
    }

}