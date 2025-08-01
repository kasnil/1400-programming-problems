import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны два числа. Найти среднее арифметическое и среднее геометрическое их моделей.
 */
fun solve() {
    print("Введите первое число: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе число: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val r = (abs(a) + abs(b)) / 2
    val s = sqrt(abs(a) * abs(b))
    println("Среднее арифметическое: $r")
    println("Среднее геометрическое: $s")
}
