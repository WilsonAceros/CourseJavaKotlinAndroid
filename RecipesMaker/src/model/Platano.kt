package model

class Platano: Frutas()
{
    private var atributoPlatano: String = "Plátano"

    fun getAtributoPlatano(): String { return this.atributoPlatano }
    fun setAtributoPlatano(atributoPlatano: String) { this.atributoPlatano = atributoPlatano}
}