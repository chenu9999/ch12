class Player {
    val name = "madrigal"
        get() = field.capitalize()

    fun castFireball(numFireballs: Int = 2) =
        println("$numFireballs" + "杯Fireball突然出現")
}