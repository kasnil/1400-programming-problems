fun main() {
    solve()
}

/**
 * Напечатать таблицу умножения на 7:
 * 1 x 7 = 7
 * 2 x 7 = 14
 * ...
 * 9 x 7 = 63
 */
fun solve() {
    (1..9).forEach { println(String.format("%d x %d = %d", it, 7, it * 7)) }
}
