package model

class Naranja: Frutas()
{
    private var atributoNaranja: String = "Naranja"

    fun getAtributoNaranja(): String { return this.atributoNaranja }
    fun setAtributoNaranja(atributoNaranja: String) { this.atributoNaranja = atributoNaranja}
}