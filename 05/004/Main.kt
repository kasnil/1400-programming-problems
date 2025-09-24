fun main() {
    solve()
}

/**
 * Напечатать числа следующим образом:
 * а) 10 10.4     б) 25 25.5 24.8
 *    11 11.4        26 26.5 25.8
 *    ...            ...
 *    25 25.4        35 35.5 34.8
 */
fun solve() {
    (10..25).forEach { println(String.format("%d %.1f", it, it.toDouble() + 0.4)) }
    (25..35).forEach { println(String.format("%d %.1f %.1f", it, it.toDouble() + 0.5, it.toDouble() - 0.2)) }
}
