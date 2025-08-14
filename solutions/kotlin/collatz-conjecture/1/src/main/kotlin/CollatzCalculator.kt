object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Only natural numbers are allowed" }
        var count = 0
        var num = start
        while (num != 1) {
            if ((num and 1) == 1) {
                num = num * 3 + 1
            } else {
                num /= 2
            }
            count++
        }
        return count
    }
}
