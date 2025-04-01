/*Almacenar en un arreglo de 10 posiciones los 10 numeros primos
comprendidos entre el el menor y el mayor. Luego mostarlos en pantalla */


fun main(){
    println("Ingresa el valor del primer numero")
    var numero1 = readln().toInt()

    println("Ingresa el valor del segundo numero")
    var numero2 = readln().toInt()

   //Aqui identificar cual de los dos numeros es el menor y cual el mayor
   val menor = minOf(numero1, numero2)
   val mayor = maxOf(numero1, numero2)
   
   //Aqui se crea el arreglo para almacenar los numeros primos
   val primos = IntArray(10)
   var contadorPrimos = 0
   var numeroActual = menor + 1 //Empiezas a buscar despues del menor

   //Aqui buscas los 10 primeros numeros dentro del rango dado
   while(contadorPrimos < 10 && numeroActual < mayor){
    if(esNumeroPrimo(numeroActual)){
        primos[contadorPrimos] = numeroActual
        contadorPrimos++
    }
    numeroActual++
   }

   if(contadorPrimos == 10){
    println("Los primeros 10 numeros primos entre $menor y $mayor son:")
    primos.forEach{print("$it ")}
   }
   else{
    println("Solo se encontraron $contadorPrimos numeros primos entre $menor y $mayor:")
    for(i in 0 until contadorPrimos){
        print("${primos[i]}")
    }
   }

}

fun esNumeroPrimo(numero:Int): Boolean{
    if(numero <= 1){
        return false
    }
    for(i in 2..Math.sqrt(numero.toDouble()).toInt()){
        if(numero % i == 0){
            return false
        }
    }
    return true
}