fun main() {
    solve()
}

/**
 * Дана сторона квадрата. Найти его периметр.
 */
fun solve() {
    print("Введите длину стороны квадрата: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val p = a * 4
    println("Периметр: $p")
}
