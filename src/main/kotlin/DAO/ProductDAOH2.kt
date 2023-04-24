package DAO

import entidad.Product
import javax.sql.DataSource



class ProductDAOH2(private var dataSource:DataSource):ProductDAO {
    override fun create(product: Product): Product {
        val sql = "INSERT INTO product (id, name,price,description,brand,category ) VALUES (?, ?, ?, ?, ?, ?)"
        return dataSource.connection.use { conn ->
            conn.prepareStatement(sql).use { stmt ->
                stmt.setString(1, product.id.toString())
                stmt.setString(2, product.name)
                stmt.setString(3, product.price.toString())
                stmt.setString(4, product.description)
                stmt.setString(5,product.brand)
                stmt.setString(6,product.category)
                product
            }
        }
    }
}