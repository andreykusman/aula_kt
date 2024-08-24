fun main() {
    val numDias = 30
    val temperaturas = DoubleArray(numDias)

    println("Digite a temperatura para cada um dos $numDias dias do mês:")
    for (dia in 1..numDias) {
        print("Temperatura do dia $dia: ")
        val temperatura = readLine()?.toDoubleOrNull()
        if (temperatura == null) {
            println("Temperatura inválida. Por favor, insira um número.")
            return
        }
        temperaturas[dia - 1] = temperatura
    }

    val mediaTemperatura = temperaturas.average()
    val temperaturaMaxima = temperaturas.maxOrNull() ?: Double.NaN
    val temperaturaMinima = temperaturas.minOrNull() ?: Double.NaN

    val diasTemperaturaMaxima = mutableListOf<Int>()
    val diasTemperaturaMinima = mutableListOf<Int>()

    for (index in temperaturas.indices) {
        if (temperaturas[index] == temperaturaMaxima) {
            diasTemperaturaMaxima.add(index + 1)
        }
        if (temperaturas[index] == temperaturaMinima) {
            diasTemperaturaMinima.add(index + 1)
        }
    }

    println("\nAnálise das Temperaturas do Mês:")
    println("Temperatura Média: ${"%.2f".format(mediaTemperatura)}")
    println("Temperatura Máxima: ${"%.2f".format(temperaturaMaxima)}")
    println("Temperatura Mínima: ${"%.2f".format(temperaturaMinima)}")
    println("Dias com Temperatura Máxima: ${diasTemperaturaMaxima.joinToString(", ")}")
    println("Dias com Temperatura Mínima: ${diasTemperaturaMinima.joinToString(", ")}")
}
