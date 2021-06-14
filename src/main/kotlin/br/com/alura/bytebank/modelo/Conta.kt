package br.com.alura.bytebank.modelo

abstract class Conta(val nome: String, val numero: Int) {

    var saldo = 0.0
    protected set

    fun depositar(valor: Double){

        if(valor > 0) this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(destino: Conta, valor: Double): Boolean {

        if(valor in 0.0 .. this.saldo) {
            sacar(valor)
            destino.depositar(valor)
            return true
        }
        return false
    }
}