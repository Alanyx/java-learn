package effectivejava.chapter5.item34;

/**
 * @author yinxing
 * @date 2019/9/4
 */

public class EnumDemo {

    /**
     * Java 枚举类型背后的基本思想很简单：它们是通过公共静态 final 属性为每个枚举常量导出一个实例的类。
     * 由于没有可访问的构造方法，枚举类型实际上是 final 的。 由于客户既不能创建枚举类型的实例也不能继承它，除了声明的枚举常量外，不能有任何实例。
     * 换句话说，枚举类型是实例控制的（第 6 页）。 它们是单例（详见第 3 条）的泛型化，基本上是单元素的枚举。
     */

    /**
     * 你应该什么时候使用枚举呢？
     * 任何时候使用枚举都需要一组常量，这些常量的成员在编译时已知。 当然，这包括“天然枚举类型”，如行星，星期几和棋子。
     * 但是它也包含了其它你已经知道编译时所有可能值的集合，例如菜单上的选项，操作代码和命令行标志。
     * 一个枚举类型中的常量集不需要一直保持不变。
     * 枚举功能是专门设计用于允许二进制兼容的枚举类型的演变。
     */

    /**
     * 总之，枚举类型优于 int 常量的优点是令人信服的。 枚举更具可读性，更安全，更强大。
     * 许多枚举不需要显式构造方法或成员，但其他人则可以通过将数据与每个常量关联并提供行为受此数据影响的方法而受益。
     * 使用单一方法关联多个行为可以减少枚举。 在这种相对罕见的情况下，更喜欢使用常量特定的方法来枚举自己的值。
     * 如果一些（但不是全部）枚举常量共享共同行为，请考虑策略枚举模式。
     */
}
