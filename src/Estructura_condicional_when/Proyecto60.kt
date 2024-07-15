package Estructura_condicional_when

fun main () {
print("Ingrese primer nota:")
val nota1 = readln().toInt()
println("Ingrese segunda mota:")
val nota2 = readln().toInt()
println("Ingrese tercer nota:")
val nota3 = readln().toInt()
val promedio = (nota1 + nota2 + nota3) / 3
when{
    promedio >= 7 -> println("Promocionado")
    promedio >= 4 && promedio < 7 -> println("Regular")
    else -> println("Reprobado")
}

}