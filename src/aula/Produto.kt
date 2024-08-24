package aula

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {
    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            quantidade = nivelMaximo
            println("Estoque do produto '$nome' reabastecido para o nível máximo de $nivelMaximo.")
        }
    }

    fun verificarEstoque() {
        println("Produto: $nome")
        println("Quantidade em estoque: $quantidade")
        if (quantidade < nivelMinimo) {
            println("Alerta: A quantidade está abaixo do nível mínimo ($nivelMinimo).")
            reporEstoque()
        } else {
            println("A quantidade está adequada.")
        }
    }
}
