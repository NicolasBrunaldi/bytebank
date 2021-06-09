class Gerente( nome: String,
               cpf: Int,
               salario: Double,
               var senha: String): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}