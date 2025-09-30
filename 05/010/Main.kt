fun main() {
    solve()
}

/**
 * Напечатать таблицу 1, 2, ..., 20 долларов США в рубли по текущему курсу
 * (значение курса вводится с клавиатуры).
 */
fun solve() {
    print("Введите текущий курс Доллара США (USD) к Российскому рублю: ")
    val usdToRub = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    println("Доллары США\tРоссийские рубли")
    (1..20).forEach { println(String.format("%11d\t%.2f", it, it.toDouble() * usdToRub)) }
}
