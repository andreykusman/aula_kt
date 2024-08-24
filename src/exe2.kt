fun main() {
    println("Digite um parágrafo de texto:")
    val texto = readLine() ?: return println("Entrada inválida")

    val contagemPalavras = contarPalavras(texto)
    println("Número total de palavras: $contagemPalavras")
}

fun contarPalavras(texto: String): Int {
    val palavras = texto.split("\\s+".toRegex())
    return palavras.filter { it.isNotBlank() }.size
}
