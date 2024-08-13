package POO_Llamada_metodos

// Declarar una clase llamada Hijos. Definir dentro de la misma un arreglo para
//almacenar las edades de 5 personas.
//Definir un método cargar donde se ingrese por teclado el arreglo de las
//edades y llame a otros dos método que impriman la mayor edad y el promedio
//de edades

class Hijos {
    val edades = IntArray(5)

    fun cargaR() {
        for(i in edades.indices) {
            print("Ingrese la edad:")
            edades[i] = readln().toInt()
        }
        mayoredad()
        promedio()
    }

    fun mayoredad() {
        var mayor = edades[0]
        for(i in edades.indices)
            if (edades[i] > mayor)
                mayor = edades[i]
        println("El hijo con mayor edad es $mayor")
    }

    fun promedio() {
        var suma = 0
        for(i in edades.indices)
            suma += edades[i]
        val promedio = suma / edades.size
        println("La edad promedio de los hijos es $promedio")
    }
}

fun main() {
    val hijos1 = Hijos()
    hijos1.cargaR()
}
