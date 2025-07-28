fun main() {
    solve()
}

/**
 * Составить программу решения линейного уравнения ax+b=0(a\neq 0).
 */
fun solve() {
    print("Введите первое число: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите второе число: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val x = -b / a
    println("Ответ: $x")
}
