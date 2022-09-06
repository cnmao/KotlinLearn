package kotlinBasic.extensions

class CD {
}

open class C

class C1 : C() {

}

open class D {
    open fun C.foo() {
        println("C.foo in D")
    }

    open fun C1.foo() {
        println("C1.foo in D")
    }

    fun doTest(c: C) {
        c.foo()
    }
}

class D1:D(){
    override fun C.foo(){
        println("C.foo in D1")
    }

    override fun C1.foo(){
        println("C1.foo in D1")
    }
}

fun main() {
    val d = D()
    val d1 = D1()
    val c = C()
    val c1 = C1()
    d.doTest(c1) // c.foo in d
    d.doTest(c)// c.foo in d

    d1.doTest(c1) // c.foo in D1

    d1.doTest(c) // c.foo in d1


}
