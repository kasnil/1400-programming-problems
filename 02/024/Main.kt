fun main() {
    solve()
}

/**
 * Даны два числа. Найти их сумму, разность, произведение, а также частное
 * от деления первого числа на второе.
 */
fun solve() {
    print("Введите первое число: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе число: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val c = a + b
    val d = a - b
    val e = a * b
    val 45tb     = a / b
    println("Сумма чисел: $c")
    println("Разность: $d")
    println("Произведение: $e")
    println("Частное: $f")
}
