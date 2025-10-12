import kotlin.math.sin

fun main() {
    solve()
}

/**
 * Напечатать «столбиком» значения \sin 2, \sin 3, ..., \sin 15.
 */
fun solve() {
    (1..15).map { it.toDouble() }.forEach { println(sin(it)) }
}
