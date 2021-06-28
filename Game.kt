fun main() {
    val player = Player()
    player.castFireball()

    //光環
    val auraColor = auraColor(karma)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    //玩家狀態
    printPlayerStatus(healthPoints, auraColor, isBlessed, player.name, healthStatus)
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