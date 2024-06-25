fun main() {
    // problema 1
    /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor = readln().toInt()
        if(valor < 10)
            println("El valor ingresado tiene un dígito")
        else
            if(valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene tres dígitos")
    } while(valor != 0)
    */
// problema2
    /*var cant = 0
    var suma = 0
    do{
        print("Ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if(valor!= 0){
            suma += valor
            cant++
        }
    } while(valor!= 0)
    if(cant != 0){
        val promedio = suma / cant
        print("El promedio de los valores ingresados es:$promedio")
    }else
        print("No se ingresaron valores")
*/
    // problema 3
    /* var cantidad_inferior = 0
     var cantidad_supeior = 0
     var cantidad_adecuada = 0
     do{
         print("Ingrese el peso de lapieza (0 pera finalizar):")
         val peso = readln().toDouble()
         if(peso > 10.2)
             cantidad_inferior++
         else
             if(peso >= 9.8)
                 cantidad_supeior++
             else
                 if(peso > 0)
                     cantidad_adecuada++
     } while(peso != 0.0)
     println("Piezas aptas:$cantidad_supeior")
     println("Piezas con un peso superior a 10.2:$cantidad_inferior")
     println("Piezas con un peso inferior a 9.8:$cantidad_adecuada");
     val suma = cantidad_inferior + cantidad_supeior + cantidad_adecuada
     println("Cantidad total de piezas procesadas:$suma")
 */

    //  Realizar un programa que acumule (sume) valores ingresados por teclado
    //hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la
    //carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a
    //cero o menor a cero.

    /*  var suma = 0
      do {
          print("Ingrese un valor:")
          val valor = readln().toInt()
          if (valor != 9999)
              suma += valor
      } while (valor != 9999)
      println("El valor acumulado es: $suma")
      if (suma == 0) {
          println("El valor acumulado es 0")
      } else {
          if (suma > 0) {
              println("El valor acumulado es mayor a 0")
          } else {
              if (suma < 0)
                  println("El valor acumulado es menor a 0")
          }
      }
  */


   /* var suma = 0.0
    do {
        print("Numero de cuenta:")
        val valor1 = readln().toInt()
        if (valor1 >= 0.0) {
            println("Ingrese el estado:")
            val valor2 = readln().toDouble()
            if (valor2 > 0.0) {
                println("Acreedor")
                suma += valor2 //+= es lo mismo que suma + valor2
            } else {
                if (valor2 < 0.0)
                    println("Deudor")
            }
        } else {
            println("Nulo")
        }
    } while (valor1 >= 0.0)
    println("Acreedores en total: $suma")
}

    */

