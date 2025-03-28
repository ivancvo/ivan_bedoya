package conexiones

class MenuConexion {
    fun menu(){
        println("En este menu puedes seleccionar el modulo a ejecutar e la base de datos \n 1: conexion del producto \n 2: conexion de los usuarios")
        when(readln().toInt()) {
            1 -> {
                println("ejecutando modulo productos...")
                val conexion = ConexionBD()
                conexion.ejecutarConexion()
            }
            2 ->{
                println("Ejecutando modulo Usuarios...")
                val usucon = conexion()
                usucon.iniciarConexion()
            }
            3 -> {
                //println("Ejecutando modulo categorias...")
                //val cat= conc()
                //cat.ini
            }

            else -> {
            println("Error seleccion invalida")
            }
        }
    }
}