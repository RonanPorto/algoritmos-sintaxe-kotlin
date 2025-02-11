fun main(args: Array<String>) {
    print("Digite o primeiro numero: ")
    val number01 = readLine()?.toIntOrNull()
    print("Digite o segundo numero: ")
    val number02 = readLine()?.toIntOrNull()
    if (number01 != null && number02 != null) {
          val soma = number01 + number02
          println("A soma dos dois numeros e: $soma")
      } else {
          println("Por favor, insira números válidos.")
      }
  }