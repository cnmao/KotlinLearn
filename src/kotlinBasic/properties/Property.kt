package kotlinBasic.properties

/**
 * 属性
 *
 * 1：Var隐藏默认setter和getter
 * 2：不可变语法的代表val可理解为final，而且不允许setter
 *
 * 可以define custom accessors for a property
 *  
 */
class Property {

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            //setDataFromString(value) // 解析字符串并赋值给其他属性
        }


}

//语法书写格式
/*
    var <property>[: <Propertytype>] [ = <Property_initializer>]
    <Setter>
    <Getter>

    var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]

    只有一个PropertypeType是大写的，其他为小写！*/