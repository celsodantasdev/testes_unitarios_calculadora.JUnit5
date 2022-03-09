import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//em CalculadoraTest apenas pegamos as fun da classe principal e testamos.
// Podemos testar gerando variáveis dentro da CalculadoraTest.

internal class CalculadoraTest {

    /*

    @Test - Indica que a função que vamos declarar vai servir para testar alguma coisa

        asserts - Validar dados de qualquer tipo

        assertEquals(Resultado Esperado, Valor que a gente vai testar )

     */

    @Test
    fun somaTest() {
        assertEquals(3.0, Calculadora.soma(1.0, 2.0))
    }

    @Test
    fun subtracaoTest() {
        assertEquals(3.0, Calculadora.subtracao(4.0, 1.0))
    }

    @Test
    fun divisaoTest() {
        assertEquals(2.0, Calculadora.divisao(4.0, 2.0))
    }

    @Test
    fun multiplicacaoTest() {
        assertEquals(4.0, Calculadora.multiplicacao(4.0, 1.0))
    }
}