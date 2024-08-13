package Contructores

class triangulo(var lado1: Int, var lado2: Int, var lado3: Int) {
    fun ladomayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esequilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triangulo equilatero")
        else
            print("No es un triangulo equilatero")
    }
}

fun main() {
    val triangulo1 = triangulo(12, 45, 24)
    triangulo1.ladomayor()
    triangulo1.esequilatero()
}