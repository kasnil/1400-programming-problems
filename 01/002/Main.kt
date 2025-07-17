fun main() {
    solve()
}

/**
 * Вывести на одной строке числа 47, 52 и 150 с двумя пробелами между ними. Текст '47  52  150' не использовать.
 */
fun solve() {
    println(intArrayOf(47, 52, 150).joinToString(separator = "  "))
}
