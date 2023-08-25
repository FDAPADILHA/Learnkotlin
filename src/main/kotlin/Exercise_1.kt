import java.lang.management.ThreadInfo

fun main(){

    //EXERCISE 1

    //a) Crie um novo arquivo com uma função main.
        //arquivo Exercise_1 criado

    //b) Declare uma variável mutável capaz de armazenar seu nome completo.
        var nomeCompleto : String = "Filipe do Amaral Padilha"
        println(nomeCompleto)

    //c) Declare uma variável de texto sem valor algum.
        var variavel : String

    //d) Declare uma variável imnutável com o menor tipo de dado possível
       //capaz de armazenar o número que você calça.
        val tam : Byte = 40

    //e) Declare uma variável capaz de armazenar o PIB do Brasil(1.869.000.000.000).
        var pibbr : String
        pibbr = "1.869.000.000.000"
        println(pibbr)

    //f) Declare uma variável capaz de armazenar a população do Brasil(211.000.000).
        var popbr : String = "211.000.000"
        println(popbr)

    //g)Imprima o valor do PIB per capita.
        val pib : Long = 1869000000000
        val pop : Int = 211000000

        var resposta : String = (pib / pop).toString()

        println("PIB per capita: " + "R$" + resposta)
    //h)Rode seu programa de maneira que não tenha erros de compilação ou execução.


}