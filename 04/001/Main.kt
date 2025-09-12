fun main() {
    solve()
}

/**
 * Даны два различных вещественных числа. Определить:
 * а) какое из них больше;
 * б) какое из них меньше.
 */
fun solve() {
    print("Введите первое вещественное число: ")
    val x1 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе вещественное число: ")
    val x2 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    if (x1 > x2) {
        println("Первое число больше второго")
    } else if (x2 > x1) {
        println("Второе число больше первого")
    } else {
        println("Числа равны")
    }
}
