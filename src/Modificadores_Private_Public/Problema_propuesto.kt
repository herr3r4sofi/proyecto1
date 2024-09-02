package Modificadores_Private_Public

class num {
    private val num = IntArray(5)

    init {
        carga()
    }

    private fun carga() {
        for(i in num.indices)
            num[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir() {
        println("Arreglo completo: ")
        for(i in num.indices)
            print("${num[i]} - ")
        println()
    }

    fun mostrarmayor() {
        var mayor = num[0]
        for(i in num.indices)
            if (num[i] > mayor)
                mayor = num[i]
        println("El numero mayor es $mayor")
    }

    fun mostrarmenor() {
        var menor = num[0]
        for(i in num.indices)
            if (num[i] < menor)
                menor = num[i]
        println("El numero menor es $menor")
    }
}

fun main() {
    val nu1 = num()
    nu1.imprimir()
    nu1.mostrarmayor()
    nu1.mostrarmenor()
}