import kotlin.math.pow
import kotlin.math.sin

fun main() {
    solve()
}

/**
 * Рассчитайте значение y при заданном значении x:
 * y = \left\{\begin{matrix}
 * \sin^{2}x \\ 1-2\sin x^{2}
 * \end{matrix}\right. \begin{matrix}
 * при x > 0 \\ в противоположном случае.
 * \end{matrix}
 */
fun solve() {
    print("Введите значение x: ")
    val x = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    if (x > 0) {
        println("Значение x больше нуля, результат функции y = ${sin(x).pow(2)}")
    } else {
        println("Значение x меньше или равен нулю, результат функции y = ${1.0 - 2.0 * sin(x * x)}")
    }
}
