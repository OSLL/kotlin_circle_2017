package K6_debugging_profiling

class DivByZeroExample{
    companion object {
        fun envResponseCoeff(p: Double, i: Double, beta: Double, n : Int, n0 : Int, epsilon: Double, delta: Double, t: Int): Double {
            return 1 / (n - n0 * t) * (1 / p) * (0.5 * (delta / n + beta / n0)) +
                    (1 + i * (delta + beta / (2 * Math.pow(epsilon, 2.0))))
        }
    }

}

fun main(args: Array<String>){

    var p : Double = 0.17
    var i : Double = 2.0
    var beta : Double = 0.05
    var n : Int = 4
    var n0 : Int = 2
    var epsilon : Double = 0.1
    var delta : Double = 7.55
    var t : Int = 3

    print("Environment response coefficient is ${DivByZeroExample.envResponseCoeff(p, i, beta, n, n0, epsilon, delta, t)} ")

    t = 2

    print("Environment2 response coefficient is ${DivByZeroExample.envResponseCoeff(p, i, beta, n, n0, epsilon, delta, t)} ")
}