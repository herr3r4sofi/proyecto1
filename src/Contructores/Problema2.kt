package Contructores

class Punto(val x: Int, val y: Int) {

    fun cuadrante() = when {
        x > 0 && y > 0 -> "primer cuadrante"
        x < 0 && y > 0 -> "segundo cuadrante"
        x < 0 && y < 0 -> "tercer cuadrante"
        x > 0 && y < 0 -> "cuarto cuadrante"
        else -> "un eje"
    }
}

fun main() {
    val punto1 = Punto(7, 2)
    println("La coordenada ${punto1.x}, ${punto1.y} está en el ${punto1.cuadrante()}")
    val punto2 = Punto(-2, 3)
    println("La coordenada ${punto2.x}, ${punto2.y} está en el ${punto2.cuadrante()}")
    val punto3 = Punto(-3, -2)
    println("La coordenada ${punto3.x}, ${punto3.y} está en  el ${punto3.cuadrante()}")
    val punto4 = Punto(15, -7)
    println("La coordenada ${punto4.x}, ${punto4.y} está en el ${punto4.cuadrante()}")
    val punto5 = Punto(0, -2)
    println("La coordenada ${punto5.x}, ${punto5.y} está en el ${punto5.cuadrante()}")
}



