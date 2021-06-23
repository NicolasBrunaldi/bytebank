import br.com.alura.bytebank.modelo.*

fun main(){

    val diretor : Funcionario = Diretor(
        nome = "Nicolas Brunaldi de Oliveira",
        cpf = "466.555.721-13",
        salario = 5000.0,
        senha = "12345",
        plr = 1000.0
    )

    val gerente : Funcionario = Gerente(nome = "Fernando Oliveira", cpf = "090.868.657-03", salario = 2300.0, senha = "54321")

    val calculadoraBonificacao = CalculadoraBonificacao()

    calculadoraBonificacao.registra(diretor)
    calculadoraBonificacao.registra(gerente)

    println("total de bonificações = ${calculadoraBonificacao.total}")
    println()

    val contaCorrenteNicolas : Conta = ContaCorrente(Cliente(nome = "Nicolas Brunaldi de Oliveira", cpf = "222.987.675-02", senha = "12345", Endereco()), numero = 1000)
    val contaPoupancaJoao : Conta = ContaPoupanca(titular = Cliente(nome = "Fernando Oliveira", cpf = "262.957.899-07", senha = "12345", Endereco()), numero = 1001)

    contaCorrenteNicolas.depositar(1000.0)
    contaPoupancaJoao.depositar(100.0)

    contaCorrenteNicolas.transferir(valor = 1000.0, destino = contaPoupancaJoao)
    println("saldo conta joão ${contaPoupancaJoao.saldo}")
    println("saldo conta joão ${contaCorrenteNicolas.saldo}")
}