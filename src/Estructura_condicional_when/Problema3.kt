package Estructura_condicional_when

fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    print("Ingrese cantidad de triangulos:")
    val n = readln().toInt()
    for (i in 1..n) {
        print("Ingrese el primer lado:")
        val lado1 = readln().toInt()
        print("Ingrese el segundo lado:")
        val lado2 = readln().toInt()
        print("Ingrese el tercer lado:")
        val lado3 = readln().toInt()
        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("Equilátero")
                cant1++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("Isòsceles")
                cant2++
            }
            else -> {
                println("Escaleno")
                cant3++
            }
        }
    }
    println("Cantidad de triángulos equilàteros es: $cant1")
    println("Cantidad de triángulos isòsceles es: $cant2")
    println("Cantidad de triángulos escalenos es: $cant3")
}