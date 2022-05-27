import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestTemplate

internal class CalculadoraTest{

    @Test
    fun somaTest() {
        assertEquals(11, Calculadora.soma(5, 6))
    }

    @Test
    fun subtracaoTest(){
        assertEquals(15, Calculadora.subtracao(20, 5))
    }

    @Test
    fun mult(){
        assertEquals(10, Calculadora.mult(2, 5))
    }

    @Test
    fun divisao(){
        assertEquals(2, Calculadora.divisao(10,5))
    }

    @Test
    fun quadrado (){
        assertEquals(9.0, Calculadora.quadrado(3.0, 2.0))
    }

    @Test
    fun raiz (){
        assertEquals(5.0, Calculadora.raiz(25.0))
    }



}