import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Даны координаты на плоскости двух точек. Найти расстояние между этими точками.
 */
fun solve() {
    print("Введите x-координату первой точки: ")
    val x1 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите y-координату первой точки: ")
    val y1 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите x-координату второй точки: ")
    val x2 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите y-координату второй точки: ")
    val y2 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val d = sqrt((x1 - x2).pow(2) + (y1 - y2).pow(2))
    println("Расстояние: $d")
}
