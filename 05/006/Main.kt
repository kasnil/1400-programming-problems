fun main() {
    solve()
}

/**
 * Напечатать числа следующим образом:
 * а) 21 20.4     б) 16 15.5 16.8
 *    22 21.4        17 16.5 17.8
 *    ...            ...
 *    35 34.4        24 23.5 24.8
 */
fun solve() {
    (21..35).forEach { println(String.format("%d %.1f", it, it.toDouble() - 0.6)) }
    (16..24).forEach { println(String.format("%d %.1f %.1f", it, it.toDouble() - 0.5, it.toDouble() + 0.8)) }
}
