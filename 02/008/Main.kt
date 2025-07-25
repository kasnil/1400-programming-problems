import kotlin.math.PI

fun main() {
    solve()
}

/**
 * Дан радиус окружности. Найти длину окружности и площадь круга.
 */
fun solve() {
    print("Введите радиус окружности: ")
    val r = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val l = 2 * PI * r
    val s = PI * r * r
    println("Длина: $l")
    println("Площадь: $s")
}
