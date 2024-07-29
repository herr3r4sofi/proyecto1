package Arreglos

fun main(){
    val arreglo=IntArray(10)
    for(i in arreglo.indices){
        print("Ingreseelemento:")
        arreglo[i]=readln().toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
}