import kotlin.math.PI

fun main() {
    solve()
}

/**
 * Найти площадь кольца по заданным внешнему и внутреннему радиусам.
 */
fun solve() {
    print("Введите внешний радиус кольца: ")
    val r1 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите внутренний радиус кольца: ")
    val r2 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val s = PI * (r1 * r1 - r2 * r2)
    println("Площадь кольца: $s")
}
