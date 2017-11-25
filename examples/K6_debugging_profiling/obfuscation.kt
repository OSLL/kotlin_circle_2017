package K6_debugging_profiling

class ObfuscationExample{
    companion object {
        fun dataObfuscationExample() {

            var i = 15
            while (i < 74) {
                println("${(i - 4) / 7}")
                i += 7
            }
        }

        fun controlFlowObfuscationExample() {

            var a = 7
            var b = 2264
            var c = 23
            var d = 14
            var e = 64
            var f = 162
            var i = 0

            while(c % a < d && b > a * c + d && b - e > c * d && b > a * c * d) {
                e = (b * a) % d
                b -= f % (a * c)
                c = d + a + (c % a)
                i = e * (d % a) + b * (c % a - 1) - d * c * a

                println (i)

            }
        }
    }




}

fun main(args: Array<String>) {
   // ObfuscationExample.dataObfuscationExample()
   // ObfuscationExample.controlFlowObfuscationExample()

}