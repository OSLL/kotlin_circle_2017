package K0_kotlin_intro

object PlanetUsage {
    @JvmStatic
    fun main(args: Array<String>) {
        val Earth = Planet("6371,0 км")
        val averageRadiusEarth = Earth.averageRadius
        println(averageRadiusEarth)
    }
}
//Рассказать, что бывает с теми, кто не ставит модификаторы доступа