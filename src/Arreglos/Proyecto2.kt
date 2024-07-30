package Arreglos

import kotlin.random.Random

/*fun main() {

    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val suma = IntArray(4)
    println("Ingrese los elementos para el arreglo 1")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readln().toInt()
    }
    println("Ingrese los elementos para el arreglo 2")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readln().toInt()
    }
    for (i in suma.indices) {
        suma[i] = arreglo1[i] + arreglo2[i]
    }
    println("El resultado de la suma es:")
    for (i in suma.indices) {
        println("Elemento ${i + 1}: ${suma[i]}")
    }
}

     */


// opcion 2
fun main() {
    val arreglo1: IntArray
     arreglo1 = IntArray(4)
    var arreglo2 = IntArray(4)
    val arregloSuma = IntArray(4)

    var verArreglo1 = "Arreglo1: "
    var verArreglo2 = "Arreglo2: "
    var verArregloSuma = "ArregloSumado: "
    for (i in 0..arreglo1.size -1){
        arreglo1[i] = Random.nextInt(from = 0, until = 10)
        arreglo2[i] = Random.nextInt(from = 0, until = 10)
        arregloSuma[i] = arreglo1[i] + arreglo2[i]
        verArreglo1 += if (i == arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + ","

        verArreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString() + ","

        verArregloSuma += if (i == arregloSuma.lastIndex)
            arregloSuma[i] else arregloSuma[i].toString() + ","
    }
    println(verArreglo1)
    println(verArreglo2)
    println(verArregloSuma)
}
