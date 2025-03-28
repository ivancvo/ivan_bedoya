package modulos

enum class Estado {
    DISPONIBLE, AGOTADO
}
data class Producto(
    val id: Int,
    val nombre: String,
    val marca: String,
    val medida: String,
    val precio_bruto: Double,
    val precio_neto: Double,
    val iva: Double,
    val unidades_totales: Int,
    val estado: Estado
)
