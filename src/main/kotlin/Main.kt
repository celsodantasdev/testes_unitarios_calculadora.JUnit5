fun main() {

    /*
    TDD - Pensar no que a nossa função vai fazer antes mesmo de programá-la
    Clicar com botão direito no nome do arquivo, ir em Generate e depois Teste
     */

    println("escreva num1 ")
    val num1 = readLine()!!.toDouble()
    println("escreva num2 ")
    val num2 = readLine()!!.toDouble()

    println("escolha um operador")

    val operador = readLine()!!

    if (operador == "+") {
        var soma = Calculadora.soma(num1,num2)
        println("A soma de $num1 e $num2 é $soma")
    } else if (operador == "-") {
        var subtracao = Calculadora.subtracao(num1,num2)
        println("A subtração de $num1 por $num2 é $subtracao")
    } else if (operador == "/") {
        var divisao = Calculadora.divisao(num1,num2)
        println("A divisão de $num1 por $num2 é $divisao")
    } else if (operador == "*") {
        var multiplicacao = Calculadora.multiplicacao(num1, num2)
        println("A multiplicacao de $num1 por $num2 é $multiplicacao")
    }

}



