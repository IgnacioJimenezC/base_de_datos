package entidad

import java.util.UUID

data class Product(
    val id: Int ,
    val name:String,
    val price:Float,
    val description:String,
    val brand:String,
    var category:String)

