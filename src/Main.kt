import TDE.CharGenerator
import TDE.Pessoa
import TDE.PessoaData
import TDE.Result

fun main() {
    val generator = CharGenerator('A', 'Z')
    println("Caractere gerado: ${generator.generateChar()}")

    val pessoa = Pessoa("João", 25)
    pessoa.caminhar()
    pessoa.falar()

    val resultado: Result = Result.Success("Operação concluída com sucesso")
    when (resultado) {
        is Result.Success -> println("Sucesso: ${resultado.data}")
        is Result.Error -> println("Erro: ${resultado.message}")
        is Result.Loading -> println("Carregando...")
    }


    val pessoaData = PessoaData("Carlos", 30, "Engenheiro", "123.456.789-00")
    val novaPessoa = pessoaData.copy(nome = "Carlos Silva")
    println("Nova Pessoa: $novaPessoa")
}