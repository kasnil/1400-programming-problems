import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Треугольник задан координатами своих вершин. Найти периметр и площадь треугольника.
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
    print("Введите x-координату третей точки: ")
    val x3 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите y-координату третей точки: ")
    val y3 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val a = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val b = sqrt((x3 - x2).pow(2) + (y3 - y2).pow(2))
    val c = sqrt((x3 - x1).pow(2) + (y3 - y1).pow(2))
    val p = a + b + c
    val p2 = p / 2 // полупериметр треугольника
    val s = sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c)) // Формула Герона
    println("Периметр: $p")
    println("Площадь: $s")
}
