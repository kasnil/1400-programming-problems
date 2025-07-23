import kotlin.math.abs
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу:
 * а) вычисления значения функции \sqrt{\frac{2a+sin|3a|}{3.56}} при любом значении a;
 * б) вычисления значения функции sin\frac{3.2+\sqrt{1+x}}{|5x|} при любом значении x.
 */
fun solve() {
    val a = Random.nextDouble()
    var y = sqrt((2 * a + sin(abs(3 * a))) / 3.56)
    println("\\sqrt{\\frac{2 × $a + sin|3 × $a|}{3.56}} = $y")
    val x = Random.nextDouble()
    y = sin((3.2 + sqrt(1 + x)) / abs(5 * x))
    println("sin\\frac{3.2 + \\sqrt{1 + $x}}{|5 × $x|} = $y")
}
