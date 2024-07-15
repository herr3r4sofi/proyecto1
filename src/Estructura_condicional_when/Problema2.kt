package Estructura_condicional_when

fun main() {
    var mayor = 0
    for (i in 1..5){
        print("Ingrese un valor entero:")
        val valor1 = readln().toInt()
        print("Ingrese un valor entero:")
        val valor2 = readln().toInt()
        print("Ingrese un valor entero:")
        val valor3 = readln().toInt()
        mayor += when{
            valor1 > valor2 && valor1 > valor3 ->valor1
            valor2 > valor3 -> valor2
            else -> valor3
        }
    }
    println("Valor acumulado del mayor de cada lista es: $mayor")
}