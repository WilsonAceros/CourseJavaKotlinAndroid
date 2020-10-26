//import model.*

const    val opcion1 :String = "Hacer una Receta"
const    val opcion2 : String = "Ver mis recetas"
const    val opcion3 : String ="Salir"


fun main(args: Array<String>)
{

    val opciones = """
 **    :: Bienvenido a Recipe Maker ::
 **       Selecciona la opción deseada
 **       1. Hacer una Receta
 **       2. Ver mis recetas
 **       3. Salir
        
    """.trimIndent()
    println (opciones.trimMargin("**"))

    do {


        val response: String? = readLine()
        when (response){
            "1"-> {
                println("Seleccionaste :$opcion1")
                makeRecipe()
            }

            "2" -> {
                println("Seleccionaste :$opcion2")
                viewRecipe()


            }

            "3"  -> {
                println("Seleccionaste :$opcion3")
            }

            else -> {
                println("Opcion no valida")
            }


        }

    }while (!response.equals("3") )
}
fun makeRecipe (){
    var recetas = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

    for ((index,recetaindividual) in recetas.withIndex() )
    {
        println("${index.plus(1)}.$recetaindividual ")
    }
}


fun viewRecipe (){

    var recetas = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

    for ((index,recetaindividual) in recetas.withIndex() )
    {
        println("${index.plus(1)}.$recetaindividual ")
    }
    println ("Selecciona un Ingrediente")


    do{
        val response2 = readLine()
        when (response2){
            "1"->{
                var cont = 0
                println("Listado de Agua")
                val lista =  listOf("Agua Mineral", "Agua Pura Vida","Agua Vieri")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Agua(cont,lista))
            }
            "2" ->{
                var cont = 0
                println("Listado de Leches")
                val lista =  listOf("Leche Pil", "Leche Hacendado","LLet Nostra","Leche Eroski","Leche President")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Leche(cont,lista))
            }
            "3"->{

                var cont = 0
                println("Listado de Carnes")
                val lista = listOf("Carne de Res","Pollo","Carne de Cardo","Carne de Oveja","Pescado","Pejerrey")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Carne(cont,lista))
            }
            "4"->{
                var cont = 0
                println("Listado de Verduras")
                val lista = listOf("Zanahoiria","Cebolla","Ajo","Perejil","Tomate","Rabano","Brocoli","Nabo")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Verduras(cont,lista))
            }
            "5"->{
                var cont = 0
                println("Listado de Frutas")
                val lista = listOf("Fresa","Platano","Uvas","Manzana","Naranja","Pera","Cereza")
                for (index in lista.withIndex())
                {
                    class Verduras (cantidad:Int,lista:List<String>):Receta(cantidad) {
                        init {



                            for ((index,tipoVerdura) in lista.withIndex() )
                            {
                                println("${index.plus(1)}.$tipoVerdura")
                            }


                        }

                    }
                    cont ++
                }
                println(Frutas(cont,lista))
            }
            "6"->{
                var cont = 0
                println("Listado de Cereales")
                val lista = listOf("Avena","Trigo","Arroz","Maiz")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Cereal(cont,lista))
            }
            "7"->{
                var cont = 0
                println("Listado de Huevos")
                val lista = listOf("Huevo Don Silvero","Huevo San Juan")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Huevos(cont,lista))
            }
            "8"->{
                var cont = 0
                println("Listado de Aceites")
                val lista = listOf("Aceite de nuez","Aceite Natural","Aceite sin Grasa")
                for (index in lista.withIndex())
                {
                    cont ++
                }
                println(Aceites(cont,lista))
            }
            else -> {
                println("Opcion no Valida")
            }

        }


    }while (!response2.equals("9"))

}

class Aceites (cantidad:Int, lista :List<String>):Receta(cantidad){
    init {2



        for ((index,tipoAceite) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoAceite")
        }


    }

}

class Agua (cantidad: Int,lista:List<String>): Receta(cantidad) {

    init {



        for ((index,marcaAgua) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaAgua")
        }


    }

}

class Leche(cantidad:Int,lista:List<String>):Receta(cantidad) {

    init {



        for ((index,marcaLeche) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaLeche")
        }


    }
}

class Carne (cantidad : Int, lista:List<String>):Receta(cantidad ){
    init {



        for ((index,tipoCarne) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoCarne")
        }


    }

}

class Verduras (cantidad:Int,lista:List<String>):Receta(cantidad) {
    init {



        for ((index,tipoVerdura) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoVerdura")
        }


    }

}


class Frutas (cantidad:Int, lista:List<String>):Receta(cantidad){
    init {



        for ((index,tipoFruta) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoFruta")
        }


    }


}

class Cereal (cantidad:Int,lista:List<String>):Receta(cantidad){

    init {



        for ((index,tipoCereal) in lista.withIndex() )
        {
            println("${index.plus(1)}.$tipoCereal")
        }
    }

}

class Huevos (cantidad:Int, lista :List<String>):Receta(cantidad){
    init {



        for ((index,marcaHuevo) in lista.withIndex() )
        {
            println("${index.plus(1)}.$marcaHuevo")
        }


    }

}


abstract class Receta (var cantidad: Int){
    override fun toString(): String {
        return "Cantidad de alimentos $cantidad"
    }
}


