package kotlinBasic.properties

/**
 * 幕后字段
 *  recursive 归的; 循环的;
 *  set一个属性set(value)
 *  参看：https://juejin.cn/post/6844903673353486343
 *
 */
class BackFields {

    var counter = 0
        set(value) {
            if (value >= 0) {
//                field = value
                counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
            }
        }

}

fun main() {
    //正常
//    var testBody = BackFields().counter
//    testBody = 1
//    println(testBody.toString())
    //-----------------------------------
    //死循环
//    var a = BackFields()
//    a.counter = 1

//-----------------------------------
    //死循环
    BackFields().counter = 1
}

//------------------------------------
//set及get的默认实现
// 例子一
class PersonA {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
}

// 例子二
class PersonAA {
    var name: String = ""
}

//作用:
//一般用于让一个属性在不同的条件下有不同的值，
class PersonC(var gender: Gender) {
    var name: String = ""
        set(value) {
            field = when (gender) {
                Gender.MALE -> "Jake.$value"
                Gender.FEMALE -> "Rose.$value"
            }
        }
}

enum class Gender {
    MALE,
    FEMALE
}

fun main(args: Array<String>) {
    // 性别MALE
    var person = PersonC(Gender.MALE)
    person.name = "Love"
    println("打印结果:${person.name}")
    //性别：FEMALE
    var person2 = PersonC(Gender.FEMALE)
    person2.name = "Love"
    println("打印结果:${person2.name}")
}