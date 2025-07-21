fun main() {
    solve()
}

/**
 * Составьте программу вывода на экран в одну строку трех любых чисел, вводимых
 * с клавиатуры, с двумя пробелами между ними.
 */
fun solve() {
    val numbers = doubleArrayOf(0.0, 0.0, 0.0)
    (0..<3).forEach {
        print("Введите число: ")
        val number = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
        numbers[it] = number
    }
    println(numbers.joinToString(separator = "  "))
}
