package kotlinBasic

class DowntoStep {

    fun rangTo(){
        for (i in 1..4){
            println(i)
        }

        for (i in 4 downTo 1 ){
            println(i)
        }
    }
}

//fun main() {
//    DowntoStep().rangTo()
//}

fun main(args: Array<String>) {
    val text = """  
        |   多行字符串
    |菜鸟教程
    |多行字符串
    |  Runoob
    |1
    |2
    """.trimMargin(">")
    println(text)    // 前置空格删除了
}