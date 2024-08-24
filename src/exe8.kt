import aula.Produto

fun main() {
    val produtos = mutableListOf<Produto>()

    println("Cadastro de Produtos")

    for (i in 1..5) {
        println("Cadastro do produto $i:")
        print("Nome do produto: ")
        val nome = readLine() ?: continue
        print("Quantidade em estoque: ")
        val quantidade = readLine()?.toIntOrNull() ?: continue
        print("Nível mínimo de estoque: ")
        val nivelMinimo = readLine()?.toIntOrNull() ?: continue
        print("Nível máximo de estoque: ")
        val nivelMaximo = readLine()?.toIntOrNull() ?: continue

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }

    println("\nVerificação de Estoque")

    for (produto in produtos) {
        produto.verificarEstoque()
        println() // Linha em branco para separar a saída de cada produto
    }
}
