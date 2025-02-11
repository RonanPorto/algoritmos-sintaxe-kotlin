fun main(args: Array<String>) {
    print("Digite o valor do lado do quadrado: ")
    val input = readLine()?.replace(',', '.')
    val lado = input?.toDoubleOrNull()
    
    if (lado != null) {
          val area = lado * lado
          val areafinal = area * 2
          println("A area do circulo e: $areafinal")
      } else {
          println("Por favor, digite um número válido.")
      }
  }