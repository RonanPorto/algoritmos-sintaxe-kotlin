fun main(args: Array<String>) {
    print("Digite quanto voce ganha por hora: ")
    val input01 = readLine()?.replace(',', '.')
    val ganha = input01?.toDoubleOrNull()
    print("Digite quanto de horas voce trabalha no mes: ")
    val input02 = readLine()?.replace(',', '.')
    val horas = input02?.toDoubleOrNull()
    
    if (ganha != null && horas != null) {
          val mensal = ganha * horas
          println("O seu salario mensal e : $mensal")
      } else {
          println("Por favor, digite um número válido.")
      }
  }