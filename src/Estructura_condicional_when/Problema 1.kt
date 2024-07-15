package Estructura_condicional_when

fun main () {
print("Ingrese un valor entero:")
    var num = readln().toInt()
    when{
        num > 0 -> println("Positivo")
        num < 0 -> println("Negativo")
        else -> println("Nulo")

    }








}