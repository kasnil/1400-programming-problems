fun main() {
    solve()
}

/**
 * Дано расстояние в сантиметрах. Найти число полных метров в нем.
 */
fun solve() {
    print("Введите расстояние в сантиметрах: ")
    val x = readLine()?.trim()?.toIntOrNull() ?: 0
    println("Метров: ${x / 100}")
}
