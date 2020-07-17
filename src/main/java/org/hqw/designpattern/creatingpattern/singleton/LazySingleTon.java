package org.hqw.designpattern.creatingpattern.singleton;

/**
 * 懒汉模式
 * 1.需要的时候才去实例化其包含的类
 * 2.多线程需要添加volatile和synchronized，保证懒汉模式的线程安全，否则线程不安全，会创建多个不同的实例
 */
public class LazySingleTon {
    /* volatile保证多线程数据一致性 */
    private static volatile Sun sun = null;

    private LazySingleTon(){}

    /* synchronized保证只创建一个Sun实例 */
    public static synchronized Sun getSun(){
        if(sun == null){
            sun = new Sun("circle");
        }

        return sun;
    }
}
