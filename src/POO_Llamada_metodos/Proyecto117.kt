package POO_Llamada_metodos

class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0

    fun carga() {
        print("Ingrese primer valor:")
        valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        valor2 = readln().toInt()
        suma()
        resta()
    }

    fun suma() {
        val suma = this.valor1 + this.valor2 // this se refiere al prametro y no al atributo
        println("La suma de $valor1 y $valor2 es $suma")
    }

    fun resta() {
        val resta = this.valor1 - this.valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}

fun main() {
    val operaciones1 = Operaciones()
    operaciones1.carga()
}
