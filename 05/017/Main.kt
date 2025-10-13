fun main() {
    solve()
}

/**
 * Рассчитать значения y для значений x, равных 4, 5, ..., 28:
 * y = 3t^2 + 4.87t - 3
 * t = x + 3
 */
fun solve() {
    (4..28)
        .map { it.toDouble() + 3.0 }
        .map { 3.0 * it * it + 4.87 * it - 3.0 }
        .forEach { println(it) }
}
