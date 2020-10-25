val welcomeMessage = """
:: Bienvenido a Recipe Maker ::

Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir
        """.trimMargin()
fun main(args: Array<String>) {
    repetir()
}

fun repetir(){
    var salir = true
    while (salir){
        println(welcomeMessage)
        val opcion:String? = readLine()
        when(opcion){
            "1" -> makeArecipe()
            "2" -> showRecipe()
            "3" ->  salir = false
            else -> println("Opcion inavalida")
        }
    }
}
fun showRecipe(){
    println("Lo sentimos actualmente no esta disponible")
}
fun makeArecipe(){
    val makeRecipe = "Selecciona los ingredientes para tu receta:"
    val ingredientes : List<String> = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    var volver = true
    val receta : List<String> = listOf()
    while (volver){
        println(makeRecipe)
        for (i in ingredientes){
            println("${ingredientes.indexOf(i).plus(1)}. ${i}")
        }
        println("Ingrese 0 para salir")
        val eleccionIngrediente:String? = readLine()
        when(eleccionIngrediente){
            "0" -> volver = false
            "1" -> receta.plus("Agua")
            "2" -> receta.plus("Leche")
            "3" -> receta.plus("Carne")
            "4" -> receta.plus("Verduras")
            "5" -> receta.plus("Frutas")
            "6" -> receta.plus("Cereal")
            "7" -> receta.plus("Huevos")
            "8" -> receta.plus("Aceite")
        }
    }


}