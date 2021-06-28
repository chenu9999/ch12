class Player {
    val name = "madrigal"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }


    fun castFireball(numFireballs: Int = 2) =
        println("$numFireballs" + "杯Fireball突然出現")
}