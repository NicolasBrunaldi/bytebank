package br.com.alura.bytebank.modelo

class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val plr: Double,
              var senha: String): Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override val bonificacao: Double
        get() {
            return 1.1 * salario + this.plr
        }

    override fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}