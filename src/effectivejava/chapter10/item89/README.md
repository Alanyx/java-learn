# 对于实例控制，枚举类型优于 readResolve

## 小结

总之，应该尽可能的使用枚举类型来实现实例控制的约束条件。

如果做不到，同时又需要一个即可序列化又可以实例受控的类，就必须提供一个 readResolve 方法，并确保该类的所有实例化字段都是基本类型，或是 transient。