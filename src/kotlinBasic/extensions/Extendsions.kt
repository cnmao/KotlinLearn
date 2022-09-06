package kotlinBasic.extensions

class Extendsions {

}

fun Extendsions.foo(x:String){
    println(x)
}

fun main() {
    val extendsions = Extendsions()
    extendsions.foo("first use kotlin extendsions")
}