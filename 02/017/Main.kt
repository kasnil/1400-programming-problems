import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны основания и высота равнобедренной трапеции. Найти ее периметр.
 */
fun solve() {
    print("Введите длину первого основания: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите длину второго основания: ")
    val d = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите высоту: ")
    val h = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val a = sqrt((d - b) * (d - b) / 4 + h * h)
    val p = 2 * a + b + d
    println("Периметр равнобедренной трапеции: $p")
}
