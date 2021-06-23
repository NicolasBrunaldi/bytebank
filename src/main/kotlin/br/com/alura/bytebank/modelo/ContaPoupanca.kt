package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double) {
        if (valor < saldo) throw SaldoInsuficienteException()

        saldo -= valor

    }

}