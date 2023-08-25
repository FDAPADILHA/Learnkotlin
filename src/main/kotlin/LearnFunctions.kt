fun main(){
    helloWolrd()
    print("A soma de 10 e 5 é: ${sum(10,5)}\r\n${divisao(10f,2f)}")
    //STRINGS
    print("\r\nTamanho da String: ${string().length}")
    print("\r\nPosição da String: ${string()[0]}")
    print("\r\n${string().startsWith("Pro")}")
    print("\r\n${string().endsWith("Pro")}")
    print("\r\n${string().substring(5)}")
    print("\r\n${string().substring(5, 8)}")
    print("\r\n${string().replace("Programação Kotlin", "Kotlin")}")
    print("\r\n${string().lowercase()}")
    print("\r\n${string().uppercase()}")
    print("\r\n${"          espaços propositais          1      ".trim()}")//Preenchimento de forms


}

fun sum(a : Int, b : Int) : Int{
    val c = (a + b)
    return (c)
}

fun sum2(a : Int, b : Int) : Int = (a + b)
fun sum3(a : Int, b : Int) = (a + b)

fun helloWolrd() {
    println("Hello World")

}

fun divisao(e : Float, f : Float) = e/f

//STRINGS

fun string() : String {
    var string = "Programação Kotlin"
    return string
}