import kotlin.random.Random

fun main() {
    print("Quantas vezes deseja lançar os dados? ")
    val numeroDeLancamentos = readLine()?.toIntOrNull()
        ?: return println("Entrada inválida. Por favor, insira um número válido.")

    if (numeroDeLancamentos <= 0) {
        println("O número de lançamentos deve ser maior que zero.")
        return
    }

    repeat(numeroDeLancamentos) { i ->
        val dado1 = Random.nextInt(1, 7)
        val dado2 = Random.nextInt(1, 7)
        val soma = dado1 + dado2

        println("Lançamento ${i + 1}: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
    }
}
