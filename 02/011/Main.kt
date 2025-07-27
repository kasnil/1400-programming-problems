fun main() {
    solve()
}

/**
 * Известны объем и масса тела. Определить плотность материала этого тела.
 */
fun solve() {
    print("Введите объем в м^{3}: ")
    val v = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите массу в кг: ")
    val m = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val p = m / v
    println("Плотность: $p")
}
