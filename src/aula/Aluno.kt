package aula

data class Aluno(
    val nome: String,
    val notas: List<Double>
) {
    fun calcularMedia(): Double {
        return notas.average()
    }

    fun foiAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}
