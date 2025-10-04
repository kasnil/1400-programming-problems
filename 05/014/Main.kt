fun main() {
    solve()
}

/**
 * Напечатать таблицу умножения на 9:
 * 1 x 9 = 9
 * 2 x 9 = 18
 * ...
 * 9 x 9 = 81
 */
fun solve() {
    (1..9).forEach { println(String.format("%d x %d = %d", it, 9, it * 9)) }
}
