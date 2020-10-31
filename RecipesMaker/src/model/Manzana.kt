package model

class Manzana: Frutas()
{
    private var atributoManzana: String = "Manzana"

    fun getAtributoManzana(): String { return this.atributoManzana }
    fun setAtributoManzana(atributoManzana: String) { this.atributoManzana = atributoManzana }
}