package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaPoupanca(nome: String, numero: Int) : Conta(nome, numero) {

    override fun sacar(valor: Double) {
        if (valor >= saldo) saldo -= valor
    }

}