package model

class Pera: Frutas()
{
    private var atributoPera: String = "Pera"

    fun getAtributoPera(): String { return this.atributoPera }
    fun setAtributoPera(atributoPera: String) { this.atributoPera = atributoPera}
}