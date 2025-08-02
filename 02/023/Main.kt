import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны стороны прямоугольника. Найти его периметр и длину диагонали.
 */
fun solve() {
    print("Введите первую сторону прямоугольника: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите вторую сторону прямоугольника: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val p = (a + b) * 2
    val d = sqrt(a * a + b * b)
    println("Периметр: $p")
    println("Длину диагонали: $d")
}
