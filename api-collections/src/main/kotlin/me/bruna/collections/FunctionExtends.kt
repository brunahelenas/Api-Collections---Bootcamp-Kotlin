package me.bruna.collections

fun main() {

    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("----------somatorio------------")
    println(salarios.somatoria())
    println("----------tudo------------")
    salarios.forEach { println(it) }
    println("------------media----------")
    println(salarios.media())
    println("----------------------")
}