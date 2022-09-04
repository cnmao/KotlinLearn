package kotlinBasic.properties

/**
 * set在初始话的时候不访问
 */
class PersonS {
    var name: String = "Paul"
        set(value) {
            println("执行了写访问器，参数为：$value")
        }

}

//测试
fun main(args: Array<String>) {
    var person = PersonS()
    // 写name属性
    person.name = "hi,this is new value"
    println("打印结果:${person.name}")
}

/**
 * 执行了写访问器，参数为：hi,this is new value
打印结果:Paul
 */


