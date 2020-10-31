import model.Camera
import model.Movie
import model.Shoe
import java.lang.Math.random

//Mala practica programacion
var n=3 //evitar usar este tipo variables

//Funciones puras

//const tiempo de compilacion
const val N="Aceros" //variables manera global

fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)

    val a = 10 //Variables local ejecución
    val b = 5

    println(a.plus(b))
    println(a.minus(b))
    println(a.div(b))

    n = 4

    println(n)

    val name = args[0]  //tiempo de ejecucion
    println(name)

    println(N)

    val nombre = "Wilson"
    val apellido: String = "Aceros"
    println("Tu nombre es: $nombre $apellido")

    val nombreapellido = "Wilson \"Aceros"

    println("Tu nombre es: $nombreapellido")

    //Raw String
    val parrafo: String = """
        ** Loren wilson
        marcela sanchez
    """.trimIndent()

    println(parrafo.trimMargin("** "))

    val oneToHundred = 1..10
    for (i in oneToHundred) {
        println(i)
    }

    for (letra in 'A'..'C') {
        println(letra)
    }
    //if operadores logicos
    val numero = 8
    if (numero.equals(2))//true
    {
        println("Si son iguales")
    } else {
        println("No son iguales")
    }

    //when es similar al switch
    when (numero) {
        in 1..5 -> println("Si esta entre 1 y 5")
        in 1..3 -> println("Si esta entre 1 y 3")
        !in 1..10 -> println("No esta entre 5 y 10")
        else -> println("No esta en alguno de los anteriores")
    }

    var i = 1
    // while contadores
    while (i < 1) {//false true
        println("mensaje: $i")
        i++
    }

    i = 1
    // Do while contadores
    do {
        println("mensaje dowhile: $i")
        i++
    } while (i < 1)

    //for
    var daysOfWeek = listOf("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
    for (day in daysOfWeek) {
        println(day)
    }
    //tener accesos a los indices
    for ((index, day) in daysOfWeek.withIndex()) {
        println("$index :$day")
    }

    //foreach
    var daysOfWeek2 = listOf("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
    daysOfWeek2.forEach {
        println(it)
    }
    //break
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    //continue
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }

        //break + label
        for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) break
                    println("k: $k")
                }
            }
        }
        terminarTodoCiclo@ for (i in 1..3) {
            println("\ni: $i ")
            for (j in 1..3) {
                println("\nj: $j")
                for (k in 1..5) {
                    if (k.equals(3)) break@terminarTodoCiclo
                    println("k: $k")
                }
            }
        }
    }

    //continue+label
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue
                println("k: $k")
            }
        }
    }
    escaparJ@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@escaparJ
                println("k: $k")
            }
        }
    }



    try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!
    } catch (e: NullPointerException) {
        println("Ingresa un valor, no aceptamos nulos")
    }

    //Llamda segura
    var compute2: String? = null
    var longitud: Int? = compute2?.length
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud de Teclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(7, null, null, 4)
    println("Lista con Null: ${listWithNulls}")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)

    //Array

    val countries = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")
    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")
    println(days)


    var arrayObject = arrayOf(5, 6, 7, 8)
    var intPrimitive: IntArray = arrayObject.toIntArray()

    val suma = arrayObject.sum()
    println("La suma del array es: $suma")

    arrayObject = arrayObject.plus(9)
    for (a in arrayObject) {
        println("Array: $a")
    }

    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject) {
        println("Array reversa $a")
    }

    arrayObject.reverse()
    for (a in arrayObject) {
        println("Array reversa $a")
    }

    var x = 5
    println("X es igual a 5? ${x == 5}") //true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    val numbers = intArrayOf(1, 2, 36, 45, 5)
    println("El promedio es: ${averageNumbers(numbers, 2)}")
    println("${evaluate('+')}")

    val hola = { println("Hola Mundo") }()

    val w = { d: Int, c: Int -> d + c }
    println(w(2, 3))

    val random1 = random()
    val random2 = { random() }

    //Lambdas
    var saludo = { println("Hola mundo") }
    saludo()

    //var suma = {instrucciones -> sentencias}
    val plus = { a: Int, b: Int, c: Int -> a + b + c }
    val result = plus(3, 4, 5)
    println(result)
    println(plus(1, 2, 3))
    println({ a: Int, b: Int, c: Int -> a + b + c }(7, 8, 9))

    val calculateNumber = { n: Int ->
        when (n) {
            in 1..3 -> println("Tu numero esta entre 1 y 3")
            in 4..7 -> println("Tu numero esta entre 4 y 7")
            in 8..10 -> println("Tu numero esta entre 8 y 10")
        }
    }
    println(calculateNumber(6))

    //Clases
    val camera = Camera()
    camera.turnOn()
    println(camera.getcameraStatus())
    camera.turnOff()
    println(camera.getcameraStatus())

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")


    var shoe = Shoe("shoe", "Blue shoe", 12345, "Praga")
    println("Shoe: ${shoe}")

    shoe.create()

    /*shoe.size = 33
    println(shoe.size)

    shoe.model = "Zapatos de tacon"
    println(shoe.model)
    println(shoe.mark)*/

    val movie = Movie("Coco","Pixar",120)
    println("MOVIE")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} min.")

    var resultado = calculadora(1,2,3, ::multiplicar)
    println("La calculadora opero una multiplicacion: $resultado")

    println("La resta fue: ${calculadora(4,5,6,::restar)}")

    println("La suma fue: ${calculadora(4,5,6,::sumar)}")

    // listas con llave y valor
    val months = hashMapOf("Enero" to 1, "Diciembre" to 12)

    val sorted = months.toList()
            .sortedBy{(key,value) -> value}
            .toMap()

    println("$sorted")

    //Filter

    val numbersInt = listOf(4,3,2)
    println(numbersInt.filter { it % 2 == 0 })


    val words = listOf("Oasis","Hola", "Holanda", "Objeto")
    println(words.filter { it.startsWith('O') })

}

fun calculadora(a: Int, b: Int, c: Int, operacion:(Int, Int, Int) -> Int): Int{
    return operacion(a,b,c)
}

fun sumar(a: Int, b: Int,c: Int) = a+b+c
fun restar(a: Int, b: Int,c: Int) = a-b-c
fun multiplicar(a: Int, b: Int,c: Int) = a*b*c


fun averageNumbers(numbers: IntArray, n: Int):Int{
    //Promedio numeros
    var sum=0
    for (num in numbers){
        sum += num
    }
    return (sum/numbers.size)+n
}

fun evaluate(character: Char='=', number: Int = 2): String{
    return "${number} es ${character}"


}
