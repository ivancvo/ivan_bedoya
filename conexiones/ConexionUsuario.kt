package conexiones

import java.sql.*
import modulos.Usuario

enum class Rol {
    ADMINISTRADOR, EMPLEADO
}

class conexion {
    private val url = "jdbc:mysql://localhost:3306/tienda"
    private val user= "root"
    private val password = ""

    val usuarios = mutableListOf<Usuario>()

    fun iniciarConexion(){
        try {
            val cone : Connection = DriverManager.getConnection(url, user, password)
            val stmt : Statement = cone.createStatement()
            val rs : ResultSet = stmt.executeQuery("SELECT * FROM usuario")

            while (rs.next()){
                val id = rs.getInt("id")
                val nombre = rs.getString("nombre")
                val contraseña = rs.getString("contraseña")
                val cedula = rs.getString("cedula")
                val email = rs.getString("email")
                val telefono = rs.getString("telefono")
                val rol = Rol.valueOf(rs.getString("rol").uppercase())

                val usuario =
                    Usuario(id, nombre, contraseña, cedula, email, telefono, rol.toString())
                usuarios.add(usuario)
            }
            println("Conexion exitosa!!")
            usuarios.forEach { println(it) }

            cone.close()
        } catch (e: SQLException){
            println("error en la conexion :(")
            e.printStackTrace()
        }catch (e: IllegalArgumentException){
            println("error: el campo rol tiene un valor invalido en la base de datos ")
        }
    }
}