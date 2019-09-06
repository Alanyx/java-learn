package effectivejava.chapter5.item41;

/**
 * @author yinxing
 * @date 2019/9/6
 */

public class Demo {

    /**
     * 标记接口与标记注解相比具有两个优点。
     *
     * 首先，也是最重要的一点，标记接口定义了一个由标记类实例实现的类型；标记注解则没有定义这样的类型。
     *     ====> 标记接口类型的存在允许在编译时捕获错误，如果使用标记注解，则直到运行时才能捕获错误。
     *
     * 标记接口对于标记注解的另一个优点是可以更精确地定位目标。
     *     =====> 如果使用目标 ElementType.TYPE 声明注解类型，它就可以被应用于任何类或接口。
     *     假设有一个标记仅适用于特定接口的实现。 如果将其定义为标记接口，则可以扩展它适用的[唯一接口]，保证所有标记类型也是适用的唯一接口的子类型。
     */

    /**
     * 标记注解优于标记接口的主要优点是它们是更大的注解工具的一部分。因此，标记注解允许在基于注解的框架中保持一致性。
     */


    /**
     * 什么时候应该使用标记注解，什么时候应该使用标记接口？
     *
     * =====> a.如果标记是应用于除类或接口以外的任何程序元素，则必须使用注解，因为只能使用类和接口来实现或扩展接口。
     *
     * =====> b.如果标记仅适用于类和接口，那么问自己问题：
     * 「可能我想编写一个或多个只接受具有此标记的对象的方法呢？」
     * 如果是这样，则应该优先使用标记接口而不是注解。这将使你可以将接口用作所讨论方法的参数类型，这将带来编译时类型检查的好处.[不必等到运行时报错]
     * 如果你能说服自己，永远不会想写一个只接受带有标记的对象的方法，那么最好使用标记注解。
     *
     * 另外，如果标记是大量使用注解的框架的一部分，则标记注解是明确的选择。
     */
}