package model

class Maiz: Cereal()
{
    private var atributoMaiz: String = "Maíz"

    fun getAtributoMaiz(): String { return this.atributoMaiz }
    fun setAtributoMaiz(atributoMaiz: String) { this.atributoMaiz = atributoMaiz}
}