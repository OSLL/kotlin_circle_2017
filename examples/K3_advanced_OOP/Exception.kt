package K3_advanced_OOP

import java.lang.Integer.parseInt

//пример NumberFormatException
fun main(args : Array<String>){
    val input = "abc"
    val temp: Int? = try {
        parseInt(input)
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }

}

/*
//Более гибкий вариант:
inline fun catchAll(LOG: Logger, message: String, action: () -> Unit) {
  try {
    action()
  } catch (t: Throwable) {
    LOG.warn("Failed to $message. ${t.message}", t)
  }
}

//Использование:
 catchAll(LOG, "action1") {
   callAction1()
 }
 catchAll(LOG, "action2") {
   callAction2()
 }
 ///  ....
 catchAll(LOG, "actionN") {
   callActionN()
 }

 */
