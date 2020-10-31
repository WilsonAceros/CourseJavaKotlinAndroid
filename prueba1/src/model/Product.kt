package model

abstract class Product(var name: String, var description: String, var sku: Int){
    override fun toString(): String{
        return "\nName: $name \nDescription: $description \nSKU $sku"
    }

    abstract fun create(): String

    abstract fun read():String

    open fun update():String{//open para poder heredar
        return "Update"
    }

    open fun delete():String{
        return "Delete"
    }
}