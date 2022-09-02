package kotlinBasic

//如果一个类要被继承，可以用open关键字进行修饰

/**
 * Kotlin中的类可以有一个主构造器，以及一个或多个构造器，主构造器是
类头部的一部分，位于类名称之后
 * class Person constructor(firstName: String) {}
如果主构造器没有任何注解，也没有任何可见度修饰符，那么constructor关键字可以省略。

class Person(firstName: String) {
}
 */
open class Personage(val name:String,val age:Int){

}
//如果子类有主构造函数，则基类必须在主构造函数中进行初始化
class Student(name:String,age:Int,var no:String,var score:Int) :Personage(name,age){

}

fun main(args:Array<String>){
    val s= Student("Robbin",12,"323",22)
    //字符串模板
    //$表示一个变量名或者变量值
    //$varName表示变量值
    //${varName.fun()}表示变量的方法返回值
    println("学生姓名: ${s.name}")
}