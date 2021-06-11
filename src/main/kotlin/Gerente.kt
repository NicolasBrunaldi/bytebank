class Gerente(nome: String,
              cpf: String,
              salario: Double,
              var senha: String): Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario * 1.1
        }

    override fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}