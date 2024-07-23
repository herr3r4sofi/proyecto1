package Funciones_parametros

//En la función main solicitar que se ingrese una clave dos veces por teclado.
//Desarrollar una función que reciba dos String como parametros y muestre un
//mensaje si las dos claves ingresadas son iguales o distintas.

fun cargarIdentificar(clave1: String, clave2: String) {
    if (clave1 == clave2)
        println("Las claves son iguales")
    else
        print("Las claves son distintas")
}

fun main() {
    print("Ingrese la primer clave:")
    val clave1 = readln()
    print("Ingrese la segunda clave:")
    val clave2 = readln()
    cargarIdentificar(clave1, clave2)
}