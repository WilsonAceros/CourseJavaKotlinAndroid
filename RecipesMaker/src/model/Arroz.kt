package model

class Arroz: Cereal()
{
    private var atributoArroz: String = "Arroz"

    fun getAtributoArroz(): String { return this.atributoArroz }
    fun setAtributoArroz(atributoArroz: String) { this.atributoArroz = atributoArroz}
}