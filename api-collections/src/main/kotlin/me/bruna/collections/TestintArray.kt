package me.bruna.collections

fun main() {

    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("Formas de imprimir vetores:" + "\n\n")
    for (i in 0 until 5)
        println("Vetor[" + i + "]" + ":" + values[i])

    println("\n" + "Outro Metodo de For" + "\n")
    for (i in values)
        println(i)

    println("\n" + "Outro Metodo ForEach" + "\n")
    values.forEach {
        println(it)
    }

    println("\n" + "Outro Metodo Indices" + "\n")
    for (index in values.indices)
        println(values[index])

    values.sort()

    println("\n" + "Metodo Sort" + "\n")
    for (valor in values)
        println(valor)

    println("\n" + "Ordenou fisiamente?" + "\n")
    for (valor in values)
        println(valor)

}