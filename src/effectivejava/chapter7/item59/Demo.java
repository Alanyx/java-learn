package effectivejava.chapter7.item59;

/**
 * @author yinxing
 * @date 2019/9/12
 */

public class Demo {

    /**
     * 使用标准类库的优点:
     * a.通过使用标准库，你可以利用编写它的专家的知识和以前使用它的人的经验。
     * b.不必浪费时间为那些与你的工作无关的问题编写专门的解决方案
     * c.随着时间的推移，它们的性能会不断提高，而你无需付出任何努力
     * d.可以将代码放在主干中。这样的代码更容易被开发人员阅读、维护和重用。
     */

    /**
     * [建议]
     * 在每个主要版本中，都会向库中添加许多特性，了解这些新增特性是值得的。
     * 每次发布 Java 平台的主要版本时，都会发布一个描述其新特性的 web 页面。
     *
     * [建议]
     * 标准类库太庞大了，不可能学完所有的文档，但每个程序员都应该熟悉 java.lang、java.util 和 java.io 的基础知识及其子包。
     */

    /**
     * 1.第一个思路应该是使用这些库，如果已经了解了它们在某些领域提供的功能，而这些功能不能满足你的需求，那么可以使用另一种实现。
     * ==========> 任何有限的库集所提供的功能总是存在漏洞。
     * 2.如果你在 Java 平台库中找不到你需要的东西，你的下一个选择应该是寻找高质量的第三方库，比如谷歌的优秀的开源 Guava 库 [Guava]。
     * 3.如果你无法在任何适当的库中找到所需的功能，你可能别无选择，只能自己实现它。
     */

    /**
     * 总之，不要白费力气重新发明轮子。
     * 如果你需要做一些看起来相当常见的事情，那么库中可能已经有一个工具可以做你想做的事情。
     * 如果有，使用它；如果你不知道，检索一下。
     * 一般来说，库代码可能比你自己编写的代码更好，并且随着时间的推移可能会得到改进。
     * 这并不反映你作为一个程序员的能力。规模经济决定了库代码得到的关注要远远超过大多数开发人员所能承担的相同功能。
     */
}
