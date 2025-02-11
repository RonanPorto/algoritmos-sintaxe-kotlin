fun main(args: Array<String>) {
    print("Digite a temperatura em Celcius: ")
    val input01 = readLine()?.replace(',', '.')
    val celcius = input01?.toDoubleOrNull()
    
    if (celcius != null) {
          val fahrenheit = (celcius * 1.8) + 32
          println("A temperatura em graus fahrenheit e : $fahrenheit")
      } else {
          println("Por favor, digite um número válido.")
      }
  }