import entidad.Product

fun main(args: Array<String>) {
    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")


    val productId = product.id
    println("Product ID: ${productId}")
}