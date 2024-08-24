package aula

fun main() {
    val alunos = mutableListOf<Aluno>()

    repeat(5) { i ->
        println("Cadastro do ${i + 1}º aluno")

        print("Nome do aluno: ")
        val nome = readLine()?.takeIf { it.isNotBlank() } ?: return println("Nome inválido")

        val notas = mutableListOf<Double>()

        repeat(3) { j ->
            print("Nota ${j + 1}: ")
            val nota = readLine()?.toDoubleOrNull()
            if (nota == null || nota !in 0.0..10.0) {
                println("Nota inválida. Digite um valor entre 0 e 10.")
                return
            }
            notas.add(nota)
        }

        alunos.add(Aluno(nome, notas))
        println()
    }

    println("Resultados:")
    alunos.forEach { aluno ->
        val media = aluno.calcularMedia()
        val status = if (aluno.foiAprovado()) "Aprovado" else "Reprovado"
        println("Nome: ${aluno.nome}, Média: ${"%.2f".format(media)}, Status: $status")
    }
}
