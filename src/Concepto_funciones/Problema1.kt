package Concepto_funciones

fun calcularCuadrado(){
    print("Ingrese el valor:")
    val valor = readln().toInt()
    val cuadrado = valor * valor
    println("El cuadrado del valor es: $cuadrado")
}
 fun separacion() {
     println("*******************************")
 }
fun calcularProducto(){
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val valor2= readln().toInt()
    val multi = valor1 * valor2
    println("El producto de los valores es: $multi")
}







fun main() {
calcularCuadrado()
    separacion()
    calcularProducto()
}
