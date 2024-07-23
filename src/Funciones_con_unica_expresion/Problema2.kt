package Funciones_con_unica_expresion

fun perimetro(lado: Int) = lado * 4

fun main(){
    print("Ingrese el lado del cuadrado:")
    val lado = readln().toInt()
    println("El perimetro es de ${perimetro(lado)} ")
}