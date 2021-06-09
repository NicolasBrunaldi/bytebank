open class Funcionario(val nome: String, val cpf: Int, val salario: Double) {

    open fun bonificacao(): Double{

        return salario * 0.1
    }

}