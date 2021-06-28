class Player {
    var name = "madrigal"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    var healthPoints = 89
    var isBlessed = true
    private val isImmortal = false

    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
        val auraColor = if (auraVisible) when (karma) {
            in 16..20 -> "綠色光環"
            in 11..15 -> "紫色光環"
            in 6..10 -> "橘黃色光環"
            in 0..5 -> "紅色光環"
            else -> "無光環"
        } else "無光環"
        return auraColor
    }

    fun formatHealthStatus() =
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

    fun castFireball(numFireballs: Int = 2) =
        println("$numFireballs" + "杯Fireball突然出現")
}