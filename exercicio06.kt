fun main(args: Array<String>) {
    print("Digite o raio do circulo: ")
    val input = readLine()?.replace(',', '.')
    val raio = input?.toDoubleOrNull()
    
    if (raio != null) {
          val area = Math.PI * Math.pow(raio, 2.0)
          println("A area do circulo e: $area")
      } else {
          println("Por favor, digite um número válido.")
      }
  }