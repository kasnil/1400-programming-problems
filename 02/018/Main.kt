import kotlin.math.abs
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу вычисления значений функций
 * z=\frac{x+\frac{2+y}{x^{2}}}{y+\frac{1}{\sqrt{x^{2}+10}}} и q=7.25\sin x-|y|
 * при любых значениях х и y.
 */
fun solve() {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val z = (x + (2 + x) / (x * x)) / (y + 1 / (sqrt(x * x + 10)))
    println("\\frac{x + \\frac{2 + y}{x^{2}}}{y + \\frac{1}{\\sqrt{x^{2} + 10}}} = $z")
    val q = 7.25 * sin(x) - abs(y)
    println("7.25 × \\sin $x - |y| = $q")
}
