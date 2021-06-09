class Gerente( nome: String,
               cpf: Int,
               salario: Double,
               var senha: String): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double{

        return salario * 0.1
    }

    fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}