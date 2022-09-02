package kotlinBasic.interfacetest

/**
 * 接口：接口泛指实体把自己提供给外界的一种抽象化物（可以为另一实体），用以由内部操作分离出外部沟通方法，使其能被内部修改而不影响外界其他实体与其交互的方式。
 *  1、紧接着别人的话题说话。2.交接处。
 *
 *  人类与电脑等信息机器或人类与程序之间的接口称为用户界面。电脑等信息机器硬件组件间的接口叫硬件接口。电脑等信息机器软件组件间的接口叫软件接口。
 *
 *  接口概念及定义
 *  接口的实现
 *  接口中的属性
 *  接口继承
 *  覆盖
 */
class InterfaceDemo {


}

interface A {
    fun foo() {
        print("A")
    }

    //bar() is not marked as abstract in A, because this is the default for interfaces if the function has no body
    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {

    }

}

class D : A, B {
    //Class 'D' must override public open fun foo(): Unit defined in kotlinBasic.interfacetest.A because it inherits multiple interface methods of it
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        TODO("Not yet implemented")
    }

}