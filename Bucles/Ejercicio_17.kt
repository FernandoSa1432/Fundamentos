/*Promediar los x primeros multiplos de 2 y determinar si ese 
promedio es mayor que los 
n primeros multiplos de 5 para valores de x y n leidos */

fun main(){
    println("Ingresa la cantidad de multiplos de 2 que quieras")
    var cantidadMultiplosDos = readln().toInt()
    println("Ingresa la cantidad de multiplos de 5 que quieras")
    var cantidadMultiplosCinco = readln().toInt()
    var suma = 0
    var multiplosdeDos = 0
    var multiplosdeCinco = 0
    
    for(num in 1..cantidadMultiplosDos){
        multiplosdeDos += 2
        suma+=multiplosdeDos
    }

    var promedio = suma/cantidadMultiplosDos

    for(num in 1..cantidadMultiplosCinco){
        multiplosdeCinco += 5
        //suma += multiplosdeCinco
    }

    if(promedio > multiplosdeCinco){
        println("El promedio de los multiplos de dos es mayor que los multiplos de cinco $promedio > $multiplosdeCinco")
    }
    else{
        println("El promedio de los multiplos de dos es menor que los multiplos de cinco $promedio < $multiplosdeCinco")
    }

}   