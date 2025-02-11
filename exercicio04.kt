fun main(args: Array<String>) {
    print("Digite a nota do primeiro bimestre: ")
    val number01 = readLine()?.toIntOrNull()
    print("Digite a nota do segundo bimestre: ")
    val number02 = readLine()?.toIntOrNull()
    print("Digite a nota do terceiro bimestre: ")
    val number03 = readLine()?.toIntOrNull()
    print("Digite a nota do quarto bimestre: ")
    val number04 = readLine()?.toIntOrNull()
    
     if (number01 != null && number02 != null && number03 != null && number04 != null) {
          val soma = number01 + number02 + number03 + number04
          val media = soma / 4.0 
          println("A média das notas é: $media")
      } else {
          println("Por favor, digite números válidos para todas as notas.")
      }
  }