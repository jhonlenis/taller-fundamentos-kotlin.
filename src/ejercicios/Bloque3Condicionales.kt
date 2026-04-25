package ejercicios

fun ejecutarBloque3() {
    println("\n=== BLOQUE 3: CONDICIONALES ===")

    // 11. Mayoría de Edad
    val edad = 20
    if (edad >= 18) {
        println("11. Puede votar")
    } else {
        println("11. No puede votar")
    }

    // 12. If como Expresión
    val nota = 4.2
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("12. Resultado académico: $resultado")

    // 13. Semáforo
    val colorSemaforo = "Rojo"
    print("13. Semáforo en $colorSemaforo: ")
    when (colorSemaforo) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Siga")
        else -> println("Color inválido")
    }

    // 14. Rangos en When
    val temperatura = 22
    print("14. Temperatura $temperatura°C: ")
    when {
        temperatura < 15 -> println("Frío")
        temperatura in 15..25 -> println("Templado")
        temperatura > 25 -> println("Calor")
    }

    // 15. Verificación de Tipo
    val variableAnonima: Any = "Soy un String"
    print("15. Tipo de dato: ")
    when (variableAnonima) {
        is String -> println("Es un String")
        is Int -> println("Es un Int")
        is Boolean -> println("Es un Booleano")
        else -> println("Tipo desconocido")
    }
}