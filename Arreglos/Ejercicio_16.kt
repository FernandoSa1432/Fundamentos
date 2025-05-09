/*Leer 9 numeros enteros, almacenarlos en un arreglo y determinar cuales datos almacenados
 * son multiplos de 2*/

import kotlin.io.readln

 fun main(){

   println("Ingresa el valor de los numeros")
    
    var numeros = IntArray(9) {0}
    for(num in numeros.indices){
      println("Ingresa el valor del numero ${num}")
      numeros[num] = readln().toInt()
   }


   println("Estos son los numeros que son multiplos de 2")
      for(num in numeros.indices){
      if(numeros[num] % 2 == 0){
         println(numeros[num])
      }
   }

   
   println("Este es el arreglo original: ${numeros.contentToString()}")

}

