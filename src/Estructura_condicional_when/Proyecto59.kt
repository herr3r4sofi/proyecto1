package Estructura_condicional_when
fun main () {
    print("Ingrese coordenada x del punto:")
    val x = readln().toInt()
    println("Ingrese coordenada y del punto:")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("Primer cuadrate")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }


}

