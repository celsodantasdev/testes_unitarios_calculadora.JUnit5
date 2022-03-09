class Calculadora {

    //tudo oq está dentro do companion object não precisa ser instanciado quando for chamado

    companion object {
        fun soma(num1: Double, num2: Double): Double {
            return num1 + num2
        }

        fun subtracao(num1: Double, num2: Double): Double{
            return num1 - num2
        }

        fun divisao(num1: Double, num2: Double): Double{
            return num1 / num2
        }

        fun multiplicacao(num1: Double, num2: Double): Double{
            return num1 * num2
        }
    }
}