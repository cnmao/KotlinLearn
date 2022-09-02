package kotlinBasic.extend

/**
 * 覆盖原则
 * 1：继承需要加（）
 */
open class CoveragePrinciple {
    open fun draw() {
        println("CoveragePrinciple")
    }
}

interface Pro {
    fun draw() {
        println("interface")
    }
}

class MainTest : Pro, CoveragePrinciple() {
    override fun draw() {
        super<CoveragePrinciple>.draw()
        super<Pro>.draw()
    }
}

