package me.bruna.collections

fun main() {

    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    println("--------------------------------------")
    funcionarios.forEach { println(it) }
    println("--------------------------------------")
    println(funcionarios.find { it.nome == "Maria" })
    println("--------------SALÁRIOS----------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("---------------GROUPBY----------------")
    funcionarios
        .groupBy { it.tipoContratacao}
        .forEach{println(it)}
}



