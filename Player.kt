class Player {
    var name = "madrigal"
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }


    fun castFireball(numFireballs: Int = 2) =
        println("$numFireballs" + "杯Fireball突然出現")
}