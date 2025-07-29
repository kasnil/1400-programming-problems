import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны катеты прямоугольного треугольника. Найти его периметр.
 */
fun solve() {
    print("Введите длину первого катета: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите длину второго катета: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val c = sqrt(a * a + b * b)
    val p = a + b + c
    println("Периметр прямоугольного треугольника: $p")
}
