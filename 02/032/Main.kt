import kotlin.random.Random

fun main() {
    solve()
}

/**
 * Известна стоимость монитора, системного блока, клавиатуры и мыши.
 * Сколько будут стоить 3 компьютера из этих элементов? N компьютеров?
 */
fun solve() {
    val pMonitor = Random.nextDouble()
    val pSystemUnit = Random.nextDouble()
    val pKeyboard = Random.nextDouble()
    val pMouse = Random.nextDouble()
    print("Введите сколько компьютеров купили: ")
    val nComputers = readLine()?.trim()?.toIntOrNull() ?: 0
    val pComputer = pMonitor + pSystemUnit + pKeyboard + pMouse
    println("Стоимость 3 компьютеров: ${pComputer * 3}")
    println("Стоимость $nComputers компьютеров: ${pComputer * nComputers.toDouble()}")
}
