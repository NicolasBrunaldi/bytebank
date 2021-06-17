package br.com.alura.bytebank.modelo

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double) {
        var valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }
}