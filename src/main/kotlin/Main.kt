fun main(args: Array<String>) {
    println("Bem vindo a Calculadora")
    operacao()
    val operador = readln().toInt()

    if(operador in 1..6) {
        println("Digite o primeiro número")
        var num1 = readln().toInt()
        println("Digite o segundo número")
        var num2 = readln().toInt()
        when{
            operador === 1 -> print("Resultado: "+(num1+num2).toFloat())
            operador === 2 -> print("Resultado: "+(num1-num2).toFloat())
            operador === 3 -> print("Resultado: "+(num1*num2).toFloat())
            operador === 4 -> print("Resultado: "+(num1/num2).toFloat())
            operador === 5 -> print("Resultado: "+ pot(num1,num2))
            operador === 6 -> print("Resultado: "+(num1%num2).toInt())

        }

    }
        else{
        print("Você está saindo da aplicação.")
    }

}

fun operacao() {

    println("Escolha uma das operações abaixo:")
    println("1 : para somar")
    println("2 : para subtrair")
    println("3 : para multiplicar")
    println("4 : para dividir")
    println("5 : para calcular a potência")
    println("6 : para calcular o módulo")
    println("7 : para sair")

}

fun pot(num1: Int,num2: Int):Int {
    var i : Int = 1
    var resultado : Int = 1
    while (i<=num2) {
        resultado *= num1
        i += 1
    }
    return resultado
}


