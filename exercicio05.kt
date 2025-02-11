fun main(args: Array<String>) {
    print("Digite quantos metros voce quer converter: ")
    val input = readLine()?.replace(',', '.')
    val metros = input?.toDoubleOrNull()
    
    if (metros != null) {
          val centimetros = metros * 100
          println("O valor convertido para centímetros é: $centimetros")
      } else {
          println("Por favor, digite um número válido.")
      }
  }