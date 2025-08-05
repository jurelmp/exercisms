fun reverse(input: String): String {
    val builder = StringBuilder()
    for (i in input.length - 1 downTo 0) {
        builder.append(input[i])
    }
    return builder.toString()
}
