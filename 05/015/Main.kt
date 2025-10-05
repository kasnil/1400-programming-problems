fun main() {
    solve()
}

/**
 * Напечатать таблицу умножения на число n (значение n вводится с клавиатуры; 1 \le n \le 9).
 */
fun solve() {
    print("Введите число: ")
    val number = readLine()?.trim()?.toIntOrNull() ?: 0
    (1..9).forEach { println(String.format("%d x %d = %d", it, number, it * number)) }
}
