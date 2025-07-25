fun main() {
    solve()
}

/**
 * Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.
 */
fun solve() {
    print("Введите длину ребра куба: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val s = 4 * a * a
    val v = a * a * a
    println("Объем: $v")
    println("Площадь боковой поверхности: $s")
}
