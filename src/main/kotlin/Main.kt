import ConnectionFactory.ConecctionFactory
import DAO.ProductDAO
import DAO.ProductDAOH2
import entidad.Product
import org.h2.jdbcx.JdbcDataSource

fun main(args: Array<String>) {

    val dataSource = JdbcDataSource()
    dataSource.setURL("jdbc:h2:./default")
    dataSource.setUser("user")
    dataSource.setPassword("user")
    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")

    val productDAO = ProductDAOH2(dataSource)
    val productId = productDAO.create(product)
    println("Product ID: $productId")
    dataSource.connection.close()

}