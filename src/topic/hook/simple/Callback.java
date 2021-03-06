package topic.hook.simple;

/**
 * 自定义一个回调：回调有一个非常好的好处是，可以在某个事件发生的时候再调用我们定义的回调
 *
 * @author Alan Yin
 * @date 2021/4/25
 */
@FunctionalInterface
interface Callback {

    void doSomething();

}
