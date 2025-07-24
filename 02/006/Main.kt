import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Считая, что Земля – идеальная сфера с радиусом R ≈ 6350 км, определить
 * расстояние до линии горизонта от точки с заданной высотой над Землей.
 */
fun solve() {
    print("Введите высоту над Землей в км.: ")
    val r = 6250.0
    val h = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val c = r + h
    val d = sqrt(c * c - r * r)
    println("Расстояние до линии горизонта в км: $d")
}
