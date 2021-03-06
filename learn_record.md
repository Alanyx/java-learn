学习记录
====

## Java 核心技术

时间|章节|
:----:|:----:|
20191110|01
20191115|第8讲 对比Vector、ArrayList、LinkedList有何区别?
20200331|00/番外篇
20200401|01
20200402|02
20200409|03



### 20200409 - 03

- 如果确实需要额外处理，Java提供的 Cleaner 机制怎么使用？

- 写 demo 测试 finalize 什么时候会执行[done]

    > java finalize方法的使用: https://blog.csdn.net/walkerJong/article/details/6950091
    > Java 对象释放与 finalize 方法: https://mazhuang.org/2015/12/15/java-object-finalize/#%E7%BB%93%E8%AE%BA-2-%E8%AF%81%E6%98%8E

- 怎么实现深度拷贝和浅拷贝？

- 幻象引用(PhantomReference)是一种常见的所谓post-mortem清理机制,什么是 post-mortem 清理机制？

### 20200413 - 04

- 4 种引用类型扩展阅读于实验[done]

    见 04 课后阅读拓展 

- 实验 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintReferenceGC 参数对于应用的作用[done]

    见 lecture4/demo4/VMParamDemo

### 20200414 - 05

- 字符串 JVM 对象缓存机制的理解以及如何良好地使用?[done]

    原文已讲解

- 阅读小结 String 源码

- jdk 9 后的 string 实现对比之前

- 阅读小结 StringBuffer、StringBuilder 源码

- InvokeDynamic 相关内容温习，已经遗忘

### 20200414 - 06

- 写反射的示例代码(invoke)[done]

    见项目 javacore.lecture6

- Facade、Observer 等很多设计目的，都可以通过动态代理优雅地实现。具体实现代码练习

### 20200414 - 07

- 阅读小结 Integer 源码

-  float、double 类型的数据在 32 位的机器不是原子性的？存在什么问题？如何解决

    不能保证更新操作的原子性，可能出现程序读取到只更新了一半数据位的数值!

- 为什么对象数组则不然，数据存储的是引用，对象往往是分散地存储在堆的不同位置

- 对象的内存结构是什么样的吗?比如，对象头的结构。如何计算或者获取某个Java对象的大小?
    
    https://www.jianshu.com/p/91e398d5d17c

### 20200420 - 08

- 阅读小结 Vector、ArrayList、LinkedList 源码

### 20200422 - 09

- 阅读小结 Hashtable、HashMap、TreeMap  源码

- HashMap 源码中的 static final int MIN_TREEIFY_CAPACITY = 64;真实含义，这个树化大小
和  static final int TREEIFY_THRESHOLD = 8; 有什么关系？
