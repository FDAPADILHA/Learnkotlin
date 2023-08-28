fun maiorDeIdade (idade : Int){
    if(idade >= 18){
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

}

fun maiorDeIdadeSmp (idade : Int) = if(idade >= 18){
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }

fun maiorDeIdadeSmpString (idade : Int) : String {
    return if(idade >= 18){
        "Maior de idade"
    } else {
        "Menor de idade"
    }
}



fun main(){

    /*val num = 10
    if(num > 10){
        println("Número maior que 20")

    }*/

    println(maiorDeIdade(19))
    println(maiorDeIdadeSmp(18))
    println(maiorDeIdadeSmpString(18))

}