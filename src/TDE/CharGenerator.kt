package TDE

class CharGenerator(private val min: Char, private val max: Char) {

    init {
        require(min <= max) { "O valor mínimo deve ser menor ou igual ao valor máximo." }
    }

    fun generateChar(): Char {
        return (min.code..max.code).random().toChar()
    }
}



