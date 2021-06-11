fun main(){

    val diretor : Funcionario = Diretor(
        nome = "Nicolas Brunaldi de Oliveira",
        cpf = "466.555.721-13",
        salario = 5000.0,
        senha = "12345",
        plr = 1000.0
    )

    val funcionario : Funcionario = Funcionario(nome = "João Ferreira da Silva", cpf = "222.312.545-86", salario = 1500.0)

    val gerente : Funcionario = Gerente(nome = "Fernando Oliveira", cpf = "090.868.657-03", salario = 2300.0, senha = "54321")

    val calculadoraBonificacao = CalculadoraBonificacao()

    calculadoraBonificacao.registra(diretor)
    calculadoraBonificacao.registra(gerente)
    calculadoraBonificacao.registra(funcionario)

    println("total de bonificações = ${calculadoraBonificacao.total}")
    println()

    val contaCorrenteNicolas :Conta = ContaCorrente(nome = "Nicolas Brunaldi de Oliveira", numero = 1000)
    val contaPoupancaJoao : Conta = ContaPoupanca(nome = "João Ferreira da Silva", numero = 1001)

    contaCorrenteNicolas.depositar(1000.0)
    contaPoupancaJoao.depositar(100.0)

    contaCorrenteNicolas.transferir(valor = 100.0, destino = contaPoupancaJoao)
    println("saldo conta joão ${contaPoupancaJoao.saldo}")
    println("saldo conta joão ${contaCorrenteNicolas.saldo}")
}