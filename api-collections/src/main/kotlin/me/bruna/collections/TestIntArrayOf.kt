package me.bruna.collections

fun main(){
    val values = intArrayOf(2,3,4,1,10,7)

    println("\n"+"Vetor Desordenado: "+"\n")
    values.forEach {
        println(it)
    }
    println("\n"+"Ordenando"+"\n")

    values.sort()

    values.forEach {
        println(it)
    }
}