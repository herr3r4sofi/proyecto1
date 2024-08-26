package Colaboracion_de_clases

/*class Dado(var valor: Int) {
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt() // random permite obtener un valor del 1 al 6 de forma aleatoria
        mostar()
    }
    fun mostar() {
        println("Valor del dado:$valor")
    }
}
class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)
    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganó")
        else
            print("Perdió")
    }
}
fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}

*/
class Dado(var valor: Int) {
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }
    fun imprimir() {
        println("Valor del dado: $valor")
    }
}
class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        var contador = 0
        do {
            dado1.tirar()
            dado2.tirar()
            dado3.tirar()
            contador++

            if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
                println("Ganó")
            } else {
                println("Perdió")
            }
        } while (dado1.valor != dado2.valor || dado2.valor != dado3.valor)

        println("Se jugó $contador veces hasta ganar")
    }
}
fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}

