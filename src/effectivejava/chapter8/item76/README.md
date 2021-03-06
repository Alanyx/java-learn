## 保持失败的原子性

### 失败的原子性

一般而言，失败的方法调用应该使对象保持在被调用之前的状态。 

具有这种属性的方法被称为具有失败原子性 （failure atomic）。


### 实现方式1

最简单的办法莫过于设计一个不可变的对象（详见第 17 条）。

如果对象不可变，失败原子性是显然的。如果一个操作失败了，它可能会阻止创建新的对象，但是永远也不会使已有的对象保持在不一致的状态之中

> 对于在可变对象上执行操作的方法，获得失败原子性最常见的办法是，在执行操作之前检查参数的有效性 （详见第 49 条）。
> 这可以使得在对象的状态被修改之前，先抛出适当的异常。

### 实现方式2

调整计算处理过程的顺序，使得任何可能会失败的计算部分都在对象状态被修改之前发生。

如果对参数的检查只有在执行了部分计算之后才能进行，这种办法实际上就是上一种办法的自然扩展。

> 为了向 TreeMap 中添加元素，元素的类型必须可以利用 TreeMap 的排序准则与其他元素进行比较的。
> 
> 如果企图增加类型不正确的元素，在 tree 以任何方式被修改之前，自然会导致 ClassCastException 异常。

### 实现方式3

在对象的一份临时拷贝上执行操作，当操作完成之后再用临时拷贝中的结果代替对象的内容。

### 实现方式4

最后一种获得失败原子性的办法远远没有那么常用，做法是编写一段恢复代码 （recovery code），
由它来拦截操作过程中发生的失败，以及便对象回滚到操作开始之前的状态上。

这种办法主要用于永久性的（基于磁盘的） 数据结构。

### 不适合保持原子性的场景

错误通常是不可恢复的，因此，当方法抛出 AssertionError 时，不需要努力去保持失败原子性。

对于某些操作，它会显著地增加开销或者复杂性，这可能不是人们期望的。

### 小结

总之，作为方法规范的一部分，它产生的任何异常都应该让对象保持在调用该方法之前的状态。

如果违反这条规则，API 文档就应该清楚地指明对象将会处于什么样的状态。
