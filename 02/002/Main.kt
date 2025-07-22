import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу вычисления значения функции \frac{a^{2}+10}{\sqrt{a^{2}+1}} при любом значении a.
 */
fun solve() {
    val a = Random.nextDouble()
    val y = (a * a + 10) / sqrt(a * a + 1)
    println("\\frac{$a^{2} + 10}}{\\sqrt{$a^{2} + 1}} = $y")
}
