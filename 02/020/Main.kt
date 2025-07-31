import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу расчета значения функций
 * a=\sqrt{|e-\frac{3}{f}|^{3}+g}, b=\sin e+\cos^{2} h и c=\frac{33g}{ef-3}
 * при любых значениях e, f, g и h.
 */
fun solve() {
    val e = Random.nextDouble()
    val f = Random.nextDouble()
    val g = Random.nextDouble()
    val h = Random.nextDouble()
    val a = sqrt(abs(e - 3 / f).pow(3) + g)
    println("\\sqrt{|$e - \\frac{3}{$f}|^{3} + $g} = $a")
    val b = sin(e) + cos(h).pow(2)
    println("\\sin $e + \\cos^{2} $h = $b")
    val c = (33 * g) / (e * f - 3)
    println("\\frac{33 × $g}{$e × $f - 3} = $b")
}
