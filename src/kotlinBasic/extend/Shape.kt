package kotlinBasic.extend

open class Shape {
    open fun draw() {
        println("1/8shape:draw")
    }

    val name: String get() = "shape:name"
}

class Zheng : Shape() {
    override fun draw() {
        super.draw()
        println("2zheng:draw")
    }

    val zhengName: String = super.name
}

/**
 * 1：父类需添加open字样
 * 2：super的使用及内部类中super后添加注解调用父类方法！
 * 3：继承时父类加（）
 * 4：父类需提供get（）
 * 5:子类如何调用父类的final字段
 * 6：程序的执行还是电脑那一套
 */

fun main() {
    Zheng().draw()
    println("3+${Zheng().zhengName}")

    ShapeOut().ShapeInner().draw()
}

class ShapeOut : Shape() {

    override fun draw() {
        println("5out:draw")
        println(ShapeInner().innerStr+"6")
    }

    inner class ShapeInner {
        fun draw() {
            println("4innertop:draw")

            ShapeOut().draw()

            println("7inner:draw")

            super@ShapeOut.draw()
        }

        val innerStr: String get() = "AAA"
    }
}