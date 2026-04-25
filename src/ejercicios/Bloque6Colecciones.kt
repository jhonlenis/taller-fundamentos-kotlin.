package ejercicios

fun ejecutarBloque6() {
    println("\n=== BLOQUE 6: COLECCIONES Y EXTENSIONES ===")

    // 26. Lista de Compras
    val listaCompras = mutableListOf("Leche", "Pan", "Huevos")
    println("26. Lista inicial: $listaCompras")
    listaCompras.add("Café")
    listaCompras.removeAt(1) // Elimina "Pan"
    println("    Lista modificada: $listaCompras")

    // 27. Filtro de Precios
    val precios = listOf(10, 55, 25, 100, 40, 80)
    val baratos = precios.filter { it < 50 }
    println("27. Precios menores a 50: $baratos")

    // 28. Buscador
    val amigos = listOf("Juan", "Alicia", "Pedro", "Ana")
    val primerConA = amigos.find { it.startsWith("A") }
    println("28. Primer amigo con 'A': $primerConA")

    // 29. Extensión de Int
    val numero = -5
    println("29. ¿Es $numero negativo? ${numero.esNegativo()}")

    // 30. Extensión de String
    val textoConEspacios = "K o t l i n   e s   g e n i a l"
    println("30. Texto original: '$textoConEspacios'")
    println("    Sin espacios: '${textoConEspacios.quitarEspacios()}'")
}
// 29. Extensión de Int
fun Int.esNegativo(): Boolean = this < 0

// 30. Extensión de String
fun String.quitarEspacios(): String = this.replace(" ", "")