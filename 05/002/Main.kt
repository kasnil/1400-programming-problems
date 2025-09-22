fun main() {
    solve()
}

/**
 * Вывести на экран любое заданное число любое заданное число раз в виде:
 * 20 20 20 20 20 20 20 20 20 20.
 */
fun solve() {
    print("Введите число: ")
    val number = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите число повторений: ")
    val count = readLine()?.trim()?.toIntOrNull() ?: 0
    println(Array(count) { number }.joinToString(separator = " "))
}
