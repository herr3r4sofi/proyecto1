package Funciones_con_argumentos_nombrados

//Elaborar una función que muestre la tabla de multiplicar del valor que le
//enviemos como parámetro. Definir un segundo parámetro llamado termino que
//por defecto almacene el valor 10. Se deben mostrar tantos términos de la tabla
//de multiplicar como lo indica el segundo parámetro.
//Llamar a la función desde la main con argumentos nombrados.

fun tabla(numero: Int, terminos: Int = 10) {
    for (i in 1..terminos) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {
    tabla(numero = 3, terminos = 10)
}




