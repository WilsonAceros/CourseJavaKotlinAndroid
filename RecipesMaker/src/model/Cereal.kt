package model

open class Cereal
{
    private var cantidad: Int = 1
    private var medicion: String = "Taza"

    fun getCantidad(): Int { return this.cantidad }
    fun setCantidad(cantidad: Int) { this.cantidad = cantidad }

    fun getMedicion(): String { return this.medicion }
    fun setMedicion(medicion: String) { this.medicion = medicion}
}