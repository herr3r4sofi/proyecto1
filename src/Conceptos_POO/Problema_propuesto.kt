package Conceptos_POO

//Implementar una clase llamada Alumno que tenga como propiedades su
//nombre y su nota. Definir los métodos para inicializar sus propiedades por
//teclado, imprimirlos y mostrar un mensaje si está regular (nota mayor o igual a
//4)
//Definir dos objetos de la clase Alumno

class Alumno {
    var nombrE: String = ""
    var nota: Int = 0

    fun Inicializar() {
        print("Ingrese el nombre del aulumno:")
        this.nombrE = readln()
        print("Ingrese la nota del alumno:")
        this.nota = readln().toInt()
    }

    fun imprimiR(){
        println("Nombre: $nombrE ")
        println("Nota: $nota")
    }

    fun regular(){
        if (nota > 4)
            println("El alumno $nombrE regular")
        else
            if (nota == 4)
                println("El alumno $nombrE no regular")
        else
                println("El alumno $nombrE no regular")
    }

}
fun main() {
    val Alumno1: Alumno
    Alumno1 = Alumno()
    Alumno1.Inicializar()
    Alumno1.imprimiR()
    Alumno1.regular()

    val Alumno2: Alumno
    Alumno2 = Alumno()
    Alumno2.Inicializar()
    Alumno2.imprimiR()
    Alumno2.regular()
}