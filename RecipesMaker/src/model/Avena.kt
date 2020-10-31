package model

class Avena: Cereal()
{
    private var atributoAvena: String = "Avena"

    fun getAtributoAvena(): String { return this.atributoAvena }
    fun setAtributoAvena(atributoAvena: String) { this.atributoAvena = atributoAvena}
}