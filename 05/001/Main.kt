fun main() {
    solve()
}

/**
 * Напечатать ряд чисел 20 в виде:
 * 20 20 20 20 20 20 20 20 20 20.
 */
fun solve() {
    println(Array(10) { 20 }.joinToString(separator = " "))
}
