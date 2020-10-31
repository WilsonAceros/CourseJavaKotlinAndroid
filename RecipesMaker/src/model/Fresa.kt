package model

class Fresa: Frutas()
{
    private var atributoFresa: String = "Fresa"

    fun getAtributoFresa(): String { return this.atributoFresa }
    fun setAtributoFresa(atributoFresa: String) { this.atributoFresa = atributoFresa}
}