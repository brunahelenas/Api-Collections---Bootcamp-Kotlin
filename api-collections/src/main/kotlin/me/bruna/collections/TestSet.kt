package me.bruna.collections

fun main(){

    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios1= setOf(joao,pedro)
    val funcionarios2 = setOf(maria)
}