package Funciones_parametros

fun mostrarmensaje(mensaje: String) {
    println("*************************************************")
    println(mensaje)
    println("*************************************************")
}
fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}
fun main() {
    mostrarmensaje("El programa calcula la suma de dos valores ingresados por teclado.")
            cargarSumar()
    mostrarmensaje("Gracias por utilizar este programa")
}
