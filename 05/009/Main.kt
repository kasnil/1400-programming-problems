fun main() {
    solve()
}

/**
 * Напечатать таблицу перевода расстояний в дюймах в сантиметры для значений
 * 10, 11, ..., 22 дюйма (1 дюйм = 25.4 мм).
 */
fun solve() {
    println("Дюймы\tСм")
    (10..22).forEach { println(String.format("%5d\t%.2f", it, it.toDouble() * 2.54)) }
}
