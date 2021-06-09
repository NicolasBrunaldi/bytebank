class Conta(val nome: String, val numero: Int) {

    var saldo = 0.0
    private set

    fun depositar(valor: Double){

        if(valor > 0) saldo += valor
    }

    fun sacar(valor: Double){

        if (saldo >= valor) saldo -= valor
    }

    fun transferir(destino: Conta, valor: Double){

        sacar(valor)
        destino.depositar(valor)
    }
}