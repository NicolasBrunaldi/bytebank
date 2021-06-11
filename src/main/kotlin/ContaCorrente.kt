class ContaCorrente(nome: String, numero: Int) : Conta(nome, numero) {

    override fun sacar(valor: Double) {
        var valorComTaxa = valor + 0.1
        super.sacar(valorComTaxa)
    }
}