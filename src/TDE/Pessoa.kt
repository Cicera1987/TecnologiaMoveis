package TDE

class Pessoa(private val nome: String, private val idade: Int) {
    fun caminhar() {
        println("caminhando")
    }

    fun falar() {
        println("falando")
    }
}