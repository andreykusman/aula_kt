package aula

class Voo(
    val numeroDoVoo: String,
    private val assentosDisponiveis: BooleanArray
) {
    fun verificarDisponibilidade(assento: Int): Boolean {
        return if (assento in assentosDisponiveis.indices) {
            assentosDisponiveis[assento]
        } else {
            println("Número de assento inválido.")
            false
        }
    }

    fun reservarAssento(assento: Int): Boolean {
        return if (assento in assentosDisponiveis.indices) {
            if (assentosDisponiveis[assento]) {
                assentosDisponiveis[assento] = false
                true
            } else {
                println("Assento já reservado.")
                false
            }
        } else {
            println("Número de assento inválido.")
            false
        }
    }
}
