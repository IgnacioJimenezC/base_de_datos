package DAO

import entidad.Product

interface ProductDAO {
    fun create(user: Product):Product
}