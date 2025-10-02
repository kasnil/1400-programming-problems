import kotlin.math.E
import kotlin.math.pow

fun main() {
    solve()
}

/**
 * Плотность воздуха убывает с высотой по закону p = p_{0}e^{-hz},
 * где p - плотность на высоте h метров, p_{0} = 1,29 кг/м^{3},
 * z = 1,25 \cdot 10^{-4}. Напечатать таблицу зависимости плотности от высоты
 * для значений от 0 - до 1000 м через каждые 100 м.
 */
fun solve() {
    val p0 = 1.29
    val z = 1.25E-4
    println(z)
    println("Высота, м\tP, кг/м^{3}")
    (0..1000 step 100).forEach { h -> println(String.format("%9d\t%.2f", h, p0 * E.pow(-h * z))) }
}
