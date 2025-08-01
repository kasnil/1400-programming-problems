import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу расчета значения функций
 * a=\frac{e+\frac{f}{2}}{3}, b=|h^{2}-g| и c=\sqrt{(g-h)^{2}-3\sin e)}
 * при любых значениях e, f, g и h.
 */
fun solve() {
    val e = Random.nextDouble()
    val f = Random.nextDouble()
    val g = Random.nextDouble()
    val h = Random.nextDouble()
    val a = (e + f / 2) / 3
    println("\\frac{$e + \\frac{$f}{2}}{3} = $a")
    val b = abs(h * h - g)
    println("|$h^{2} - $g| = $b")
    val c = sqrt((g - h).pow(2) - 3 * sin(e))
    println("\\sqrt{($g - $h)^{2} - 3 × \\sin $e)} = $b")
}
