fun main() {
    var healthPoints = 89
    var isBlessed = true
    //val isImmortal = false 用不到

    val player = Player()
    player.castFireball()

    //光環
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    //val auraVisible = isBlessed && healthPoints > 50 || isImmortal 用不到
    val auraColor = auraColor(karma)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    //玩家狀態
    printPlayerStatus(healthPoints, auraColor, isBlessed, name, healthStatus)
}

private fun printPlayerStatus(
    healthPoints: Int,
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    val statusFormatString = "(血量:$healthPoints) (光環顏色:$auraColor) " +
            "(運氣:${if (isBlessed) "好" else "壞"}) -> $name $healthStatus"
    println(statusFormatString)
}

private fun auraColor(karma: Int) =
    when (karma) {
        in 16..20 -> "綠色光環"
        in 11..15 -> "紫色光環"
        in 6..10 -> "橘黃色光環"
        in 0..5 -> "紅色光環"
        else -> "無光環"
    }

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "狀態極佳"
        in 90..99 -> "有一些小擦傷"
        in 75..89 -> if (isBlessed) {
            "雖有一些傷口，但恢復很快"
        } else {
            "有一些傷口"
        }
        in 15..74 -> "嚴重受傷"
        else -> "狀態不妙"
    }

/*private fun drink(glass: Int) {
    val drunkenness = when (glass) {
        0 -> "清醒"
        in 1..10 -> "微醺"
        in 11..20 -> "微醉"
        in 21..30 -> "醉了"
        in 31..40 -> "大醉"
        in 41..50 -> "爛醉如泥"
        else -> "沒意識"
    }
    println("酒醉狀態: $drunkenness")
}*/