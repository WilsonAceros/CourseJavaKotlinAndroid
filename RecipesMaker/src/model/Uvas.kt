package model

class Uvas: Frutas()
{
    private var atributoUvas: String = "Uvas"

    fun getAtributoUvas(): String { return this.atributoUvas }
    fun setAtributoUvas(atributoUvas: String) { this.atributoUvas = atributoUvas}
}