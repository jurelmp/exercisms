object ArmstrongNumber {

    fun check(input: Int): Boolean {
        var i = input
        var result = 0
        val digits = mutableListOf<Int>()
        while (0 < i) {
            digits.add(i % 10)
            i = i / 10
        }

        when (digits.size) {
            1 -> return true
            2 -> return false
        }
        for (x: Int in digits) {
            result += Math.pow(x.toDouble(), digits.size.toDouble()).toInt()
        }
        return input == result
    }

}
