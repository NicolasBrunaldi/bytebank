class Conta(val nome: String, val numero: Int) {

    var saldo = 0.0
    private set

    fun depositar(valor: Double){

        if(valor > 0) this.saldo += valor
    }

    fun sacar(valor: Double){

        if (this.saldo >= valor) this.saldo -= valor
    }

    fun transferir(destino: Conta, valor: Double): Boolean {

        if(valor in 0.0 .. this.saldo) {
            sacar(valor)
            destino.depositar(valor)
            return true
        }
        return false
    }
}