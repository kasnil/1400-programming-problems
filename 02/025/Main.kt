fun main() {
    solve()
}

/**
 * Даны длины сторон прямоугольного параллелепипеда. Найти его объем и площадь
 * боковой поверхности.
 */
fun solve() {
    print("Введите сторону а: ")
    val a = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите сторону b: ")
    val b = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите сторону c: ")
    val c = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val v = a * b * c
    val s = 2 * (a * c + b * c)
    println("Объем: $v")
    println("Площадь боковой поверхности: $s")
}
