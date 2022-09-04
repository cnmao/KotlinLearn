package kotlinBasic.nestedandinnerclasses

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

//nested
class Outer {
    fun doOne() {

    }

    class InClass {
        val dooP = 1
    }
}

//inner class
class OutClass {

    private val outValue = 1

    inner class InClass {
        fun foo() = outValue
    }

}

val value = OutClass().InClass().foo()

//anonymous inner classes  一个MouseAdapter()的具体实现 且内部方法特征为方法中的信息！
//window.addMouseListener(object : MouseAdapter() {
//
//    override fun mouseClicked(e: MouseEvent) { ... }
//
//    override fun mouseEntered(e: MouseEvent) { ... }
//})





