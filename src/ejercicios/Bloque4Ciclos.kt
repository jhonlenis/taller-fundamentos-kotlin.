package ejercicios

fun ejecutarBloque4() {
    println("\n=== BLOQUE 4: CICLOS ===")

    // 16. Conteo Simple
    print("16. For 1-10: ")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // 17. Cuenta Regresiva
    print("17. DownTo 10-1: ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // 18. Saltos de 3
    print("18. Step 3 (1-20): ")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    // 19. While Infinito (Casi)
    var energia = 5
    print("19. Descargando: ")
    while (energia > 0) {
        print("[$energia%] ")
        energia--
    }
    println("Sin energía")

    // 20. Do-While
    var contrasena: String
    var intentos = 0
    println("20. Simulación Do-While (Password):")
    do {
        // En una app real pediríamos input, aquí simulamos
        contrasena = if (intentos < 2) "abcd" else "1234"
        println("   Intento ${intentos + 1}: Ingresando '$contrasena'")
        intentos++
    } while (contrasena != "1234")
    println("   ¡Acceso concedido!")
}