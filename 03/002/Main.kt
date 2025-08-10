fun main() {
    solve()
}

/**
 * Дана масса в килограммах. Найти число полных центнеров в ней.
 */
fun solve() {
    print("Введите масса в килограммах: ")
    val x = readLine()?.trim()?.toIntOrNull() ?: 0
    println("Центнеров: ${x / 100}")
}
