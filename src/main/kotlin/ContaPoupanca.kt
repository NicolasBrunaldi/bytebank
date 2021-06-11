class ContaPoupanca(nome: String, numero: Int) : Conta(nome, numero) {

    override fun sacar(valor: Double) {
        if (valor >= saldo) saldo -= valor
    }

}