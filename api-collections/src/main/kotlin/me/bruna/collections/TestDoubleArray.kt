package me.bruna.collections

fun main(){

    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 1500.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] =salario * 1.1
    }

    println("\n"+"Salarios Atualizados: "+"\n")

    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0,1250.0,5000.0)
    println("\n"+"Usando DoubleArrayOf (ORDENADO): "+"\n")
    salarios2.sort()
    salarios2.forEach { println(it) }

}