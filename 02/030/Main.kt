import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Выпуклый четырехугольник задан координатами своих вершин.
 * Найти площадь этого четырехугольника как сумму площадей треугольников.
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
    print("Введите x-координату четвертой точки: ")
    val x4 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите y-координату четвертой точки: ")
    val y4 = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val a = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val b = sqrt((x3 - x2).pow(2) + (y3 - y2).pow(2))
    val c = sqrt((x4 - x3).pow(2) + (y4 - y3).pow(2))
    val d = sqrt((x1 - x4).pow(2) + (y1 - y4).pow(2))
    val k = sqrt((x3 - x1).pow(2) + (y3 - y1).pow(2))
    val p1 = (a + b + k) / 2
    val p2 = (k + d + c) / 2
    val s1 = sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - k))
    val s1 = sqrt(p2 * (p2 - k) * (p2 - d) * (p2 - c))
    val s = s1 + s2
    println("Площадь: $s")
}
