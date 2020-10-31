package model

class Cereza: Frutas()
{
    private var atributoCereza: String = "Cereza"

    fun getAtributoCereza(): String { return this.atributoCereza }
    fun setAtributoCereza(atributoCereza: String) { this.atributoCereza = atributoCereza}
}