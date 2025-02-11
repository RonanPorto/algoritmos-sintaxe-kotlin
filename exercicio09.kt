fun main(args: Array<String>) {
    print("Digite a temperatura em Fahrenheit: ")
    val input01 = readLine()?.replace(',', '.')
    val fahrenheit = input01?.toDoubleOrNull()
    
    if (fahrenheit != null) {
          val celcius = (fahrenheit - 32) * 5 / 9
          println("A temperatura em graus celcius e : $celcius")
      } else {
          println("Por favor, digite um número válido.")
      }
  }