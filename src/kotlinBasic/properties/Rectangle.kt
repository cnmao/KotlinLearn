package kotlinBasic.properties

/**
 * 此例子说明：
 *  为对象内部属性设置公开的访问
 *  it will be called every time you access the property
 *
 * 大括号代表对象级别吗？还是说一个 处理单元？
 * val <propertyName>[:<ProperType>] [=<property_initializer>]
 *  [<getter>]
 *  [<setter>]
 *
 *
 */
class Rectangle(val width: Int, val height: Int) {
    val area: Int
        get() =
            this.width * this.height

    //you can omit the property type if it can be define from the getter:
    //         省略                              推断
    val areaPro get() = this.width * this.height

    //自定义setter , 除初始化的以外情况都会被调用
    var costomSetter: String
        get() = this.toString()
        set(value) {
//            doSomething(value)
        }

    // annotate 给。。做注解    accessor 存取子; 存取; 访问器; 存取器; 访问方法
    //针对某一属性添加可见性或者是添加注解 不需要改变默认实现
    var setterVisibility: String = "abc"
        private set

    var setterWithAnnotation: Any? = null
//        @Inject set  // annotate the setter with Inject
}
//-----------------------------------------------------
/**
 * 读一个属性的本质是执行了getter
 */
class Person {
    var name: String = "Paul"
        get() = "i am getter,name is Jake"
}

//测试
fun main(args: Array<String>) {
    var person = PersonS()
    // 读name属性
    val name = person.name
    println("打印结果:$name")
}
//打印结果:i am getter,name is Jake