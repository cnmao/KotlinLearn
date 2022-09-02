package kotlinBasic.extend

/**
 * 抽象类 抽象方法
 */
open class Polygon {
    open fun draw() {

    }
}

abstract class Rect : Polygon() {
    abstract override fun draw()
}