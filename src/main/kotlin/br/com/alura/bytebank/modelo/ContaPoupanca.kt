package br.com.alura.bytebank.modelo

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double) {
        if (valor >= saldo) saldo -= valor
    }

}