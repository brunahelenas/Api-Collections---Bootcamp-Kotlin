package me.bruna.collections

fun main(){

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("Imprimindo salários: ")
    for(salario in salarios)
    println(salario)

    println("------------------------------")
    println("\n"+"Maior Salário: ${salarios.maxOrNull()}")
    println("\n"+"Menos Salário: ${salarios.minOrNull()}")
    println("\n"+"Media Salário: ${salarios.average()}")

    salarios.sort()
    println("------------------------------")
    println("\n"+"Salarios Ordenados: ")
    salarios.forEach { println(it) }


    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("------------------------------")
    println("Salários maior que 2500: ")
    salariosMaiorQue2500.forEach{println(it)}

    println("------------------------------")
    println(salarios.count{it in 2500.0 .. 5000.0})

    println("------------------------------")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 250.0})
    println("------------------------------")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})

}