package Funciones_con_unica_expresion

fun Retornarsuperficie(lado: Int) = lado * lado

fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    println("La superficie del cuadrado es ${Retornarsuperficie(lado)}")
}
