package Funciones_con_unica_expresion

fun convertirCastellano(valor: Int) = when (valor) {
    1 -> "Uno"
    2 -> "Dos"
    3 -> "Tres"
    4 -> "cuatro"
    5 -> "Cinco"
    else -> "Error"
}
fun main(){
    for (i in 1..6)
        println(convertirCastellano(i))
}