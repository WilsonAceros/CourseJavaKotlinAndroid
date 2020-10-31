import model.*

fun main(args: Array<String>) {
    println("Bienvenido a Recipe Maker")
    do
    {
        println("\nSelecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
        val response: String? = readLine()
        when (response)
        {
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("¡Vuelve pronto!")
        }
    } while (response!="3")
}

fun makeRecipe()
{
    do {
        println("Hacer receta")
        val ingredients = listOf<String>("Agua", "Leche", "Carne",
                "Verduras", "Frutas", "Ceral", "Huevos", "Aceites")
        for((index, ingredient) in ingredients.withIndex())
        {
            println("${index.plus(1)}. $ingredient")
        }
        val response = readLine().toString().toInt()
        when (response)
        {
            5 -> showFruits()
            6 -> showCereals()
        }
    } while (response in 1..8)
}

fun viewRecipe()
{
    println("Ver mis recetas")
}

fun showFruits()
{
    do {
        println("""
        1. Fresa
        2. Plátano
        3. Uvas
        4. Manzana
        5. Naranja
        6. Pera
        7. Cereza
    """.trimIndent())
      val response: Int = readLine().toString().toInt()
        when(response)
        {
            1 -> { val fresa = Fresa()
                println(fresa.getAtributoFresa())
            }
            2 -> { val platano = Platano()
                println(platano.getAtributoPlatano())
            }
            3 -> { val uvas = Uvas()
                println(uvas.getAtributoUvas())
            }
            4 -> { val manzana = Manzana()
                println(manzana.getAtributoManzana())
            }
            5 -> { val naranja = Naranja()
                println(naranja.getAtributoNaranja())
            }
            6 -> { val pera = Pera()
                println(pera.getAtributoPera())
            }
            7 -> { val cereza = Cereza()
                println(cereza.getAtributoCereza())
            }
        }
    } while (response in 1..7)
}

fun showCereals()
{
    do {
        println("""
        1. Avena
        2. Trigo
        3. Arroz
        4. Maíz
    """.trimIndent())
        val response: Int = readLine().toString().toInt()
        when(response)
        {
            1 -> { val avena = Avena()
                println(avena.getAtributoAvena())
            }
            2 -> { val trigo = Trigo()
                println(trigo.getAtributoTrigo())
            }
            3 -> { val arroz = Arroz()
                println(arroz.getAtributoArroz())
            }
            4 -> { val maiz = Maiz()
                println(maiz.getAtributoMaiz())
            }
        }
    } while (response in 1..4)
}