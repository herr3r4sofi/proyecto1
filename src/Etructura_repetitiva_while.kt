fun main() {
    /*var x = 1
    while(x <= 100) { // se ponen las llaves porque el ciclo se va a repetir, es mejor usarlos en este tipos de ciclos
        println(x)
        x = x + 1 // x es 1 y cada vez que se compruebe el while le suma uno al
    } */

    /* println("Ingrese un numero:")
     val valor: Int = readln().toInt()
     var x = 1
     while (x <= valor) {
         println(x)
         x++
     }
 */
    /*var x = 1
    var suma = 0

    while (x <= 10){
        print("Ingrese el valor $x:")
        val valor = readln().toInt()
        suma = suma + valor
        x++ // se usa para incrmentar x + 1 (x = x +1)
    }
    println("La suma de los 10 valores integrados es: $suma")
    val promedio = suma / 10
    println("El promedio es $promedio")
*/
    print("Cuantas piezas procesarà:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingrese la medida de la pieza:")
        val largo: Double = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30) {
            cantidad = cantidad + 1
        }
        x++
    }
    println("La cantidad de piezas aptas son: $cantidad")
    

    }