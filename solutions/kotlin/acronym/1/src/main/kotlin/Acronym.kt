object Acronym {
    fun generate(phrase: String) : String {
        var result = ""
        for(c in phrase.split(" ", "-")) {
            for (d in c) {
                if (d.isLetter()) {
                    result += d.uppercase()
                    break
                }
            }
        }
        return result
    }
}
