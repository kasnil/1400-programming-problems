import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны два целых числа. Найти:
 * а) их среднее арифметическое;
 * б) их среднее геометрическое.
 */
fun solve() {
    print("Введите первое целое число: ")
    val a = readLine()?.trim()?.toIntOrNull() ?: 0
    print("Введите второе целое число: ")
    val b = readLine()?.trim()?.toIntOrNull() ?: 0
    println("Среднее арифметическое: ${(a + b).toDouble() / 2.0}")
    println("Среднее геометрическое: ${sqrt(a.toDouble() * b.toDouble())}")
}
