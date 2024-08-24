fun main() {
    val nomes = mutableListOf<String>()

    // Coletar os nomes dos alunos
    println("Digite o nome de 10 alunos:")

    repeat(10) { i ->
        print("Nome do ${i + 1}º aluno: ")
        val nome = readLine()?.takeIf { it.isNotBlank() } ?: return println("Nome inválido")
        nomes.add(nome)
    }

    nomes.sort()

    println("\nLista de alunos em ordem alfabética:")
    nomes.forEachIndexed { index, nome ->
        println("${index + 1}. $nome")
    }
}
