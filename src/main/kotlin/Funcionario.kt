class Funcionario(val nome: String, val cpf: Int, val salario: Double) {

    fun bonificacao(): Double{

        return salario * 0.1
    }

}