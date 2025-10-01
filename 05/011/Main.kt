import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    solve()
}

/**
 * Считая, что Земля - идеальная сфера с радиусом R ≈ 6350 км, определить
 * расстояние до линии горизонта от точки с высотой над Землей, равной 1, 2, ..., 10 км.
 */
fun solve() {
    val r = 6350.0
    println("Высота над Землей\tРасстояние до линии горизонта")
    (1..20).forEach { println(String.format("%17d\t%.2f", it, sqrt((r + it.toDouble()).pow(2) - r * r))) }
}
