import java.lang.Math.pow
import kotlin.math.*

fun main(){
    println(max(5,10))
    println(min(5,10))
    println(sqrt(144f))
    println(PI)
    println(E)
    println(round(45.5))

    //1
    println(tempoanos(2))
    //2
    println(qtdCaracteresString("Padilha"))
    //3
    println(cuboInt(3))
    //4
    println(milhas(2f))
    //5
    println(stringX("Filipe do Amaral Padilha"))
}

fun tempoanos(anos : Int){
    println("${(anos)} anos equivalem a:"
    + "\r\n${(anos) * 12}"
    + "\r\n${(anos) * 365}"
    + "\r\n${(anos) * 8760}"
    + "\r\n${(anos) * 525600}"
    + "\r\n${(anos) * 31536000}")
}

fun qtdCaracteresString(string : String){
    println(string.length)
}

fun cuboInt (num : Int){
    var cubo = pow(3.0, num.toDouble())
    println(cubo)
}

fun milhas(milha : Float){
    var mkm = milha * 1.6f
    println(mkm)
}

fun stringX(palavra : String){
    var texto = palavra.replace("a", "x").replace("A","x").lowercase()
    println(texto)
}

//EXERCISE_2

/*
1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos
2. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
4. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
5 Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
6. Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se sim, transforme-as.
*/