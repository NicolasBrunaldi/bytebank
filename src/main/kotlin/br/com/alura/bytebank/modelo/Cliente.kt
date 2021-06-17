package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String,
    var Endereco: Endereco = Endereco()
) {


}