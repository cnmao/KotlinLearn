package kotlinBasic

/**
 * 如果主构造器没有任何注解，也没有任何可见度修饰符，那么constructor关键字可以省略。
 * open class Person constructor(name: String, age: Int)
 *
 * @see Personage
 */
open class Father ( val name: String, val age: Int) {

}

class Son(name: String, age: Int, var sex: String):Father(name , age){

}

fun main(args:Array<String>) {
    val s = Son("毛泽齐",4 , "男")
//    println(s、)
    println("测试string内部引用：${s.name}+${s.age}+${s.sex}")
}



