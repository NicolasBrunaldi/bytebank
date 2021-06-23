package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double) {
        var valorComTaxa = valor + 0.1
        if (saldo < valorComTaxa) throw SaldoInsuficienteException()
        saldo -= valorComTaxa
    }
}