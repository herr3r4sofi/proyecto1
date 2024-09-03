package Funciones_tipo_arreglo

fun recorrerMatriz1(matriz: Array<IntArray>) {
    for (i in (0 until matriz.size)) {
        println()
        for (j in (0 until matriz[i].size))
            println(
                "Posicion[$i][$j] : " +
                        "${matriz[i][j]}"
            )
    }
}

fun recorrermatriz2(matriz: Array<IntArray>) {
    for (i in matriz.indices) {
        println()
        for (j in matriz[i].indices)
            println("Posicion[$i][$j] : ${matriz[i][j]}")
    }

}


fun main() {

    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
        intArrayOf(10, 11, 12, 13, 14),
    )
    println(matriz[0][0]) //1
    println(matriz[0][2]) //3
    //println(matriz[0][3]) da error porque la columna 3 no existe en la fila 0

    recorrermatriz2(matriz)


}