object Bob {
    fun hey(input: String): String {
        val str = input.trimEnd()
        val filtered = str.filter { it.isLetter() }
        val isAllCaps = filtered.isNotBlank() && filtered.all { it.isUpperCase() }

        return if (str.isBlank()) {
            "Fine. Be that way!"
        } else if (str.endsWith("?")) {
            if (isAllCaps) {
                "Calm down, I know what I'm doing!"
            } else {
                "Sure."
            }
        } else if (isAllCaps) {
            "Whoa, chill out!"
        } else {
            "Whatever."
        }
    }
}
