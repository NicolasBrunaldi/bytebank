open class Funcionario(val nome: String, val cpf: Int, val salario: Double) {

    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

}