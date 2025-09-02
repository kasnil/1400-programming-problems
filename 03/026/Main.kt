fun main() {
    solve()
}

/**
 * Дано трехзначное число, в котором все цифры различны.
 * Получить шесть чисел, образованных при перестановке цифр заданного числа.
 */
fun solve() {
    print("Введите трехзначное число: ")
    val n = readLine()?.trim()?.toIntOrNull() ?: 0
    val n1 = n / 100
    val n2 = n % 100 / 10
    val n3 = n % 10
    println("$n1$n2$n3")
    println("$n1$n3$n2")
    println("$n2$n1$n3")
    println("$n2$n3$n1")
    println("$n3$n1$n2")
    println("$n3$n2$n1")
}
