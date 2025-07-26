import kotlin.math.pow
import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу.
 * а) вычисления значения функции x=2x^{3}-3.44xy+2.3^{2}-7.1y+2 при любом значении x и y;
 * б) вычисления значения функции x = 3.14(a+b)^{3}+2.75b^{2}-12.7a-4.1 при любом значении a и b.
 */
fun solve() {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    var z = 2 * x.pow(3) - 3.44 * x * y + 2.3 * x * x - 7.1 * y + 2
    println("2 × $x^{3} - 3.44 × $x × $y+2.3^{2} - 7.1 × $y + 2 = $z")
    val a = Random.nextDouble()
    val b = Random.nextDouble()
    z = 3.14 * (a + b).pow(3) + 2.75 * b * b - 12.7 * a - 4.1
    println("3.14 × ($a + $b)^{3} + 2.75 × $b^{2} - 12.7 × $a - 4.1 = $z")
}
