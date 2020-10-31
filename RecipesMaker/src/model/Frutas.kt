package model

open class Frutas ()
{
    private var cantidad: Int = 1
    private var presentacion: String = "En trozos"

    fun getCantidad(): Int { return this.cantidad }
    fun setCantidad(cantidad: Int) { this.cantidad = cantidad }

    fun getPresentacion(): String { return this.presentacion }
    fun setPresentacion(presentacion: String) { this.presentacion = presentacion}
}