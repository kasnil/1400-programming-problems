fun main() {
    solve()
}

/**
 * Известны количество жителей в государстве и площадь его территории.
 * Определить плотность населения в этом государстве.
 */
fun solve() {
    print("Введите количество жителей: ")
    val v = readLine()?.trim()?.toIntOrNull() ?: 0
    print("Введите площадь территории: ")
    val m = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val p = m / v.toDouble()
    println("Плотность: $p")
}
