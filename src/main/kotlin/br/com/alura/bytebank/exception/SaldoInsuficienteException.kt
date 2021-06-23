package br.com.alura.bytebank.exception

import java.lang.Exception

class SaldoInsuficienteException(message: String = "Saldo Insuficiente") : Exception(message) {

}
