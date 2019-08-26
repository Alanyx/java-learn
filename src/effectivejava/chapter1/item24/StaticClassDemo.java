package effectivejava.chapter1.item24;

/**
 * @author yinxing
 * @date 2019/8/26
 */

public class StaticClassDemo {


    /**
     * 如果你声明了一个不需要访问宿主实例的成员类，则把 static 修饰符放在它的声明中，使它成为一个静态成员类，而不是非静态的成员类。
     *
     * 如果你忽略了这个修饰符，每个实例都会有一个隐藏的外部引用给它的宿主实例。 如前所述，存储这个引用需要占用时间和空间。
     * 更严重的是，并且会导致即使宿主类在满足垃圾回收的条件时却仍然驻留在内存中（详见第 7 条）。
     * 由此产生的内存泄漏可能是灾难性的。 由于引用是不可见的，所以通常难以检测到。
     */

    /**
     * 有四种不同的嵌套类，每个都有它的用途：
     * 如果一个嵌套的类需要在一个方法之外可见，或者太长而不能很好地适应一个方法，使用一个成员类。
     *
     * a.如果一个成员类的每个实例都需要一个对其宿主实例的引用，使其成为非静态的; 否则，使其静态。
     * b.假设这个类属于一个方法内部，如果你只需要从一个地方创建实例，并且存在一个预置类型来说明这个类的特征，那么把它作为一个匿名类(参见 item20 - MyAbstractList)；否则，把它变成局部类。
     */
}
