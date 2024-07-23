package Funciones_parametros

//Confeccionar una función que reciba tres enteros y los muestre ordenados de
//menor a mayor. En la función main solicitar la carga de 3 enteros por teclado y
//proceder a llamar a la primer función definida


fun mayormenor(val1: Int, val2: Int, val3: Int) {
    when {
        val1 < val2 && val1 < val3 -> {
            if (val2 < val3)
                println("$val1, $val2, $val3 ")
            else
                println("$val1, $val3, $val2 ")
        }
        val2 < val3 -> {
            if (val1 < val3)
                println("$val2, $val1, $val3")
            else
                println("$val2 $val3 $val1")
        }
        else -> {
            if (val1 < val2)
                println("$val3, $val1, $val2")
            else
                println("$val3, $val2, $val1")
        }
    }
}

fun main() {
    print("Ingrese primer valor:")
    val val1 = readln().toInt()
    print("Ingrese segunda valor:")
    val val2 = readln().toInt()
    print("Ingrese tercer valor:")
    val val3 = readln().toInt()
    mayormenor(val1, val2, val3)
}
