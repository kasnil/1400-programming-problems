import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны основания и высота равнобедренной трапеции. Найти периметр трапеции.
 */
fun solve() {
    print("Введите первое основание: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе основание: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите высоту: ")
    val h = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val c = sqrt(h * h + ((b - a) / 2).pow(2))
    val p = a + b + 2 * c
    println("Периметр: $p")
}
