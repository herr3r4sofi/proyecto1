package Arreglos

fun main() {
    val arreglo = IntArray(10)
    for (i in 0..arreglo.size - 1) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    var ordenado = true
    for (i in 0..arreglo.size - 2)//-1 compara el 9 con el 10 y el 10 no existe, el -2 compara el 8 y el 9
        if (arreglo[i + 1] < arreglo[i])
            ordenado = false
    if (ordenado)
        print("Los elementos no están ordenados de menor a mayor")
    else
        print("Los elementos   están ordenados de menor a mayor")
}

