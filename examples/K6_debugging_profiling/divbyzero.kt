/// Вставьте весь код ниже вместо метода onCreate в вашей Activity

class DivByZeroExample{
    companion object {
        fun envResponseCoeff(p: Double, i: Double, beta: Double, n : Int, n0 : Int, epsilon: Double, delta: Double, t: Int): Double {
            val c = 1/p
            val b = (0.5 * (delta / n + beta / n0)) 
            val a = n - n0 * t
            val z = (2 * Math.pow(epsilon, 2.0))
            return 1 / a * c * b +
                    (1 + i * (delta + beta / z ))
        }
    }
}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var p : Double = 0.17
    var i : Double = 2.0
    var beta : Double = 0.05
    var n : Int = 4
    var n0 : Int = 2
    var epsilon : Double = 0.1
    var delta : Double = 7.55
    var t : Int = 3

    Log.d("debug example", "Environment response coefficient is ${DivByZeroExample.envResponseCoeff(p, i, beta, n, n0, epsilon, delta, t)} ")

    t = 2

    Log.d("debug exmaple", "Environment2 response coefficient is ${DivByZeroExample.envResponseCoeff(p, i, beta, n, n0, epsilon, delta, t)} ")
}
