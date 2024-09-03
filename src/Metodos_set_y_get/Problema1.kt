package Metodos_set_y_get

// Confeccionar una clase que represente un Empleado. Definir como
// propiedades su nombre y su sueldo.
// No permitir que se cargue un valor negativo en su sueldo.
// Codificar el método imprimir en la clase

class Empleado {
    var nombre: String = ""
        set(valor) {
            field = valor
        }
    var sueldo: Double = 0.0
        set(valor) {
            if (valor < 0)
                field = 0.0
            else
                field = valor
        }
    fun imprimir(){
        print("$nombre tiene un sueldo de: $sueldo")
    }

}
fun main(){
    val empleado1 = Empleado()
    empleado1.nombre = "Joshua"
    empleado1.sueldo = 12.0
    empleado1.imprimir()



    }