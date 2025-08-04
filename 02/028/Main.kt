import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.tan

fun main() {
    solve()
}

/**
 * Даны основания равнобедренной трапеции и угол при большем основании.
 * Найти площадь трапеции.
 */
fun solve() {
    print("Введите первое основание: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе основание: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите угол при большем основании: ")
    val alpha = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val s = abs(a * a - b * b) * tan((alpha * PI) / 180) / 4
    println("Площадь: $s")
}
