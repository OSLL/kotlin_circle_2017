data class Player(var name: String, var _class:String, var dex:Int = 1,
             var str: Int = 1, var lvl:Int = 1, var maxHP:Int = 10,
             var nextLvlXP: Int= 10, var XP:Int = 0, var HP:Int = 10){
    private fun lvlUp(){
        lvl+=1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        maxHP = (maxHP*1.1).toInt()
        nextLvlXP *= 2
        HP = maxHP
        println ("Lvl up! Your stats are ${toString()}")
    }

    fun increaseXP(newXP : Int){
        println("Got ${newXP} XP")
        XP += newXP
        if (XP > nextLvlXP) lvlUp()
    }
}

fun main(args: Array<String>){
    val player = Player("hero1", "warrior")
    for (i in 0 until 5) player.increaseXP(5)
}
