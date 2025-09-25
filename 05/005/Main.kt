fun main() {
    solve()
}

/**
 * Напечатать числа следующим образом:
 * а) 21 19.2     б) 45 44.5 44.2
 *    20 18.2        44 43.5 43.2
 *    ...            ...
 *    10 8.2         25 24.5 24.2
 */
fun solve() {
    (21 downTo 10).forEach { println(String.format("%d %.1f", it, it.toDouble() - 1.8)) }
    (45 downTo 25).forEach { println(String.format("%d %.1f %.1f", it, it.toDouble() - 0.5, it.toDouble() - 0.8)) }
}
