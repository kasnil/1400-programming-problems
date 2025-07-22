import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Составить программу:
 * а) вычисления значения функции y = 17x^{2} – 6x + 13 при любом значении x;
 * б) вычисления значения функции y = 3a^{2} + 5a – 21 при любом значении а.
 */
fun solve() {
    val x = Random.nextInt()
    var y = 17 * x * x - 6 * x + 13
    println("17 × $x^{2} – 6 × $x + 13 = $y")
    val a = Random.nextInt()
    y = 3 * a * a + 5 * a - 21
    println("3 × $a^{2} + 5 × $a – 21 = $y")
}
