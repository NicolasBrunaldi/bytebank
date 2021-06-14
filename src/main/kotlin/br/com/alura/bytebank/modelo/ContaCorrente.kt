package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaCorrente(nome: String, numero: Int) : Conta(nome, numero) {

    override fun sacar(valor: Double) {
        var valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }
}