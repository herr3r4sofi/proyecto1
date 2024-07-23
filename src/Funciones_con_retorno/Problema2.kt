package Funciones_con_retorno

//Elaborar una función que nos retorne el perímetro de un cuadrado pasando
//como parámetros el valor del lado

fun retornarPerimetro(ladop: Int): Int {
    val peri = ladop + ladop + ladop + ladop
    return peri
}
fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    val perimetro = retornarPerimetro(lado)
    println("La superficie del cuadrado es $perimetro")
}