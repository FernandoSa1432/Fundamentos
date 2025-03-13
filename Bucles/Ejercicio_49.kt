fun main(){

    for(firstColumn in 1..10 ){

        for(secondColumn in 1..3){

            var digito = firstColumn / 3 + 1

            for(thirdColumn in 1..3){
                
                println("${firstColumn + secondColumn} ${digito} ${thirdColumn}")
            }
        }
    }
}