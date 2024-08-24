import aula.Voo

fun main() {
    val numeroDoVoo = "1234AB"
    val totalAssentos = 10
    val assentosDisponiveis = BooleanArray(totalAssentos) { true } // Inicializa todos os assentos como disponíveis

    val voo = Voo(numeroDoVoo, assentosDisponiveis)

    while (true) {
        println("\nSistema de Reserva de Passagens")
        println("1. Verificar disponibilidade de assento")
        println("2. Reservar assento")
        println("3. Sair")
        print("Escolha uma opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Digite o número do assento para verificar: ")
                val assento = readLine()?.toIntOrNull()
                if (assento != null) {
                    if (voo.verificarDisponibilidade(assento)) {
                        println("Assento $assento está disponível.")
                    } else {
                        println("Assento $assento não está disponível.")
                    }
                } else {
                    println("Número do assento inválido.")
                }
            }
            2 -> {
                print("Digite o número do assento para reservar: ")
                val assento = readLine()?.toIntOrNull()
                if (assento != null) {
                    if (voo.reservarAssento(assento)) {
                        println("Assento $assento reservado com sucesso.")
                    } else {
                        println("Não foi possível reservar o assento $assento.")
                    }
                } else {
                    println("Número do assento inválido.")
                }
            }
            3 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
