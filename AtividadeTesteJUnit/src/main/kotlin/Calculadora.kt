import kotlin.math.pow

class Calculadora {

    companion object{

        fun soma(n1: Int, n2: Int): Int {
            return n1 + n2
        }

        fun subtracao(n1: Int, n2: Int): Int{
            return n1 - n2
        }

        fun mult(n1: Int, n2: Int): Int{
            return n1 * n2
        }

        fun divisao(n1: Int, n2: Int): Int {
            return n1 / n2
        }

        fun quadrado (n1: Double, n2: Double): Double {
            return n1.pow(n2)
        }


        fun raiz(n1: Double): Double {
            return kotlin.math.sqrt(n1)
        }

    }
}

