fun main() {
    solve()
}

/**
 * Дан радиус окружности. Найти ее диаметр.
 */
fun solve() {
    print("Введите радиус окружности: ")
    val r = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val d = 2 * r
    println("Диаметр: $d")
}
