package Arreglos

// Desarrollar un programa que permita ingresar un arreglo de 8 elementos
// enteros, e informe:
// El valor acumulado de todos los elementos.
// El valor acumulado de los elementos que sean mayores a 36.
// Cantidad de valores mayores a 50.
// (Definir dos for, en el primero realizar la carga y en el segundo proceder a
// analizar cada elemento

fun main() {

    val numeros = IntArray(8)
    for (i in numeros.indices) {
        print("Ingrese el valor entero ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }
    var sumaTotal = 0
    var sumamayores36 = 0
    var cantidadmayores50 = 0
    for (valor in numeros) {
        sumaTotal += valor
        if (valor > 36) {
            sumamayores36 += valor
        }
        if (valor > 50) {
            cantidadmayores50++
        }
    }
    println("Valor acumulado de todos los elementos: $sumaTotal")
    println("Valor acumulado de los elementos mayores a 36: $sumamayores36")
    println("Cantidad de valores mayores a 50: $cantidadmayores50")
}
