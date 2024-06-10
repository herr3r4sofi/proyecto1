import kotlin.system.exitProcess

fun main() {
    /*var x = 1
    while(x <= 100) { // se ponen las llaves porque el ciclo se va a repetir, es mejor usarlos en este tipos de ciclos
        println(x)
        x = x + 1 // x es 1 y cada vez que se compruebe el while le suma uno
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
    /*print("Cuantas piezas procesarà:")
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

     */

// Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
//cuántos tienen notas mayores o iguales a 7 y cuántos menores.

   /* var x = 1
    var suma = 0
    var mayor = 0
    var menor = 0
    while (x <= 10){
        print("Ingrese la nota $x:")
        val valor = readln().toInt()
        suma = suma + valor
        x++

        if (valor >= 70) mayor++
        else
            menor++
    }
    println("Tienen nota mayor a 7: $mayor")
    println("Tienen nota menor a 7: $menor")

    */


// Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa
//por teclado). Mostrar la altura promedio de las personas

    /*print("Ingrese la cantidad de alturas:")
    var x = 1
    var suma = 0.0
    val n = readln().toInt()
    while (x <= n) {
        print("Ingrese la altura:")
        val valor = readln().toDouble()
        suma = suma + valor
        x++
    }
    val promedio = suma / n
    println("El promedio de las alturas es: $promedio")
     */
//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
//$500, realizar un programa que lea los sueldos que cobra cada empleado e
//informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más
//de $300. Además el programa deberá informar el importe que gasta la
//empresa en sueldos al personal.

    /*print("Cantidad de empleados:")
    val n = readln().toInt()
    var x = 1
    var valor1 = 0
    var valor2 = 0
    var gasto = 0.0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo = readln().toDouble()
        if (sueldo <= 300)
            valor1 = valor1 + 1
        else
            valor2 = valor2 + 1
        gasto = gasto + sueldo;
        x = x + 1
    }
    println("Sueldos entre 100 y 300: $valor1")
    println("Cobran más de 300: $valor2")
    println("Gastos en sueldos: $gasto")
     */

   // Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
   // etc. (No se ingresan valores por teclado)

    /*
    var x = 1
    var termino = 11
    while (x <= 25) {
        println(termino)
        termino = termino + 11
        x++
    }
*/
    //Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16
    //- 24, etc


    /*var x = 1
    var multiplo = 8
    while (x <= 62){
        println(multiplo )
    multiplo = multiplo + 8
        x ++

        }
*/
   // Realizar un programa que permita cargar dos listas de 5 valores cada una.
    //Informar con un mensaje cual de las dos listas tiene un valor acumulado
    //mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
    //Tener en cuenta que puede haber dos o más estructuras repetitivas en un
    //algoritmo

    /*println("Lista 1 de 5 valores")
    var suma1 = 0
    var x1 = 0
    while (x1 <= 5) {
        print("Ingrese valores: ")
        val valor1 = readln().toInt()
        suma1 = suma1 + valor1
        x1++
    }
    var suma2 = 0
    var x2 = 1
    println("Lista 2 de 5 valores")
    while (x2 <= 5) {
    print("Ingrese valores:")
    val valor2 = readln().toInt()
    suma2 = suma2 + valor2
        x2++
        }
    if (suma1 > suma2)
        println("La lista 1 es mayor")
    else
        if (suma2 > suma1)
            println("La lista 2 es mayor")
    else
       println("Las listas son iguales")
     */

//Desarrollar un programa que permita cargar n números enteros y luego nos
//informe cuántos valores fueron pares y cuántos impares.
//Emplear el operador "%" en la condición de la estructura condicional: if (valor % 2 == 0) //Si el if se verifica verdadero luego es
//par.

    /*var x = 1
    var par = 0
    var impar = 0
    print("Ingrese la cantidad de numeros deseados:")
    val n = readln().toInt()
    while ( x <= n) {
        println("Ingrese un numero:")
        val valor = readln().toInt()
        x++
        if (valor % 2 == 0)
            par = par + x
        else
            impar = impar + x
    }
    println("La cantidad de numeros pares son: $par")
    println("La cantidad de numeros impar son: $impar")
     */
}