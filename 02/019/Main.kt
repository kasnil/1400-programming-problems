import kotlin.math.abs
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу расчета значения функций
 * x=\frac{\frac{2}{a^{2}+25}+b}{\sqrt{b}+\frac{2+b}{2}} и y=\frac{|a|+2\sin b}{5.5a}
 * при любых значениях a и b.
 */
fun solve() {
    val a = Random.nextDouble()
    val b = Random.nextDouble()
    val x = ((2 / (a * a + 25)) + b) / (sqrt(b) + (a + b) / 2)
    println("\\frac{\\frac{2}{$a^{2} + 25} + $b}{\\sqrt{$b} + \\frac{2 + $b}{2}} = $x")
    val y = (abs(a) + 2 * sin(b)) / (5.5 * a)
    println("\\frac{|$a| + 2 × \\sin $b}{5.5 × $a} = $y")
}
