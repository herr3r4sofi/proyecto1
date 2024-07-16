package Estructura_condicional_when_argumento

fun main() {
    print("Ingrese un valor entero entre 1 y 5:")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        4 -> print("Cuatro")
        5 -> print("Cinco")
        else -> print("Valor fuera de rango")
    }
}
