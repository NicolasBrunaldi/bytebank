class Gerente(val nome: String, val cpf: Int, val salario: Double, var senha: String) {

    fun bonificacao(): Double{

        return salario * 0.1
    }

    fun autentica(senha: String): Boolean {
        if (senha.equals(this.senha)){
            return true
        }

        return false
    }
}