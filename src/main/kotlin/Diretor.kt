class Diretor(nome: String,
              cpf: String,
              salario: Double,
              val plr: Double,
              var senha: String): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + this.plr
        }

    fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}