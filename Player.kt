class Player {
    var name = "madrigal"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    var healthPoints = 89
    var isBlessed = true
    private val isImmortal = false

    fun castFireball(numFireballs: Int = 2) =
        println("$numFireballs" + "杯Fireball突然出現")
}