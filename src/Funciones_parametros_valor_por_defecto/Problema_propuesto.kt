package Funciones_parametros_valor_por_defecto

//Confeccionar una función que reciba entre 2 y 5 enteros. La misma nos debe
//retornar la suma de dichos valores. Debe tener tres parámetros por defecto

fun  suma(v1: Int,  v2: Int, v3: Int = 0, v4: Int =  0, v5: Int =  0): Int {
 return v1 + v2 + v3 + v4 + v5
}
fun main() {
    println(suma(2, 3))
    println(suma(1, 2, 2))
    println(suma(1, 1, 1, 2, 1))
}