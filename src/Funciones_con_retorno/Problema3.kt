package Funciones_con_retorno

// Confeccionar una función que calcule la superficie de un rectángulo y la retorne,
//la función recibe como parámetros los valores de dos de sus lados:
//fun retornarSuperficie(lado1: Int,lado2: Int): Int
//● En la función main del programa cargar los lados de dos rectángulos y luego
//mostrar cual de los dos tiene una superficie mayor


fun retornarsuperficie(lado1: Int,lado2: Int): Int {
   val su = lado1 * lado2
    return su
}

fun main() {
    print("Ingrese primer lado del rectangulo 1:")
    val lado1 = readln().toInt()
    print("Ingrese primer lado del rectangulo 1:")
    val lado2 = readln().toInt()
    print("Ingrese primer lado del rectangulo 2:")
    val lado3 = readln().toInt()
    print("Ingrese primer lado del rectangulo 2:")
    val lado4 = readln().toInt()
    if (retornarsuperficie(lado1,lado2) > retornarsuperficie(lado3, lado4))
        println("El rectangulo 1 tiene mayor superficie")
    else
        println("El rectangulo 2 tiene mayor superficie")
}
