import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Известна стоимость 1 кг конфет, печенья и яблок. Найти стоимость всей покупки,
 * если купили x кг конфет, у кг печенья и z кг яблок.
 */
fun solve() {
    val pCandy = Random.nextDouble()
    val pCookie = Random.nextDouble()
    val pApple = Random.nextDouble()
    print("Введите сколько кг конфет купили: ")
    val mCandy = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите сколько кг печенья купили: ")
    val mCookie = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    print("Введите сколько кг яблок купили: ")
    val mApple = readLine()?.trim()?.toDoubleOrNull() ?: 0.0
    val p = pCandy * mCandy + pCookie * mCookie + pApple * mApple
    println("Стоимость всей покупки: $p")
}
