package aula

import kotlin.math.sqrt

class Exe1 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Digite um número:")
            val numero = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

            if (ehPrimo(numero)) {
                println("$numero é um número primo.")
            } else {
                println("$numero não é um número primo.")
            }
        }

        fun ehPrimo(n: Int): Boolean {
            if (n <= 1) return false
            if (n == 2) return true
            if (n % 2 == 0) return false

            val limite = sqrt(n.toDouble()).toInt()
            for (i in 3..limite step 2) {
                if (n % i == 0) return false
            }

            return true
        }
    }
}
