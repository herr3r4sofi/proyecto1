package Estructura_condicional_when

fun main() {
var total = 0
    for (i in 1..3){
        print("Ingrese sueldo del operario:")
        val sueldo = readln().toInt()
        total += when {
            sueldo > 5000 -> {
                println("Sueld alto")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
    println("Gastos totales en sueldos altos: $total")
}