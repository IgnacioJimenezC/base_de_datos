package ConnectionFactory
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object ConecctionFactory {
    private const val URL = "jdbc:h2:~/test"
    private const val USERNAME = "usuario"
    private const val PASSWORD = "pestillo"

    fun conectarse(): Connection?{
        var conexion : Connection? = null
        try {
            Class.forName("org.h2.Driver")
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD)
        } catch (e: SQLException){
            println(e)
        }
        return conexion
    }
}