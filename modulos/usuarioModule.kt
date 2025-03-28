package modulos

data class Usuario (
    val id : Int,
    val nombre : String,
    val contraseña : String,
    val cedula: String,
    val email: String,
    val telefono : String,
    val rol: String
)