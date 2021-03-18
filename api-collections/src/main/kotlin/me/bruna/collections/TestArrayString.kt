package me.bruna.collections

fun main(){

    val nomes = Array(size = 3) {" "}

    nomes[0]="Maria"
    nomes[1]="Amanda"
    nomes[2]="Cássia"

    println("\n"+"Nomes Desordenados: "+"\n")
    for(nome in nomes)
        println(nome)
    println("\n"+"Nomes Ordenados: "+"\n")

    nomes.sort()

    for(nome in nomes)
        println(nome)

    val nomes2 = arrayOf ("Maria","Amanda","Cassia")

    println("\n"+"Outra forma de inicializar String:"+"\n")
    nomes2.sort()
    nomes2.forEach { println(it) }


}