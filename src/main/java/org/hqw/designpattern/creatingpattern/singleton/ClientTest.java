package org.hqw.designpattern.creatingpattern.singleton;

public class ClientTest {
    public static void main(String[] args) {
        /* 饿汉模式测试 */
        System.out.println("饿汉模式打印第一次的Sun对象:" + HungrySingleton.getSun());
        System.out.println("饿汉模式打印第二次的Sun对象:" + HungrySingleton.getSun());
        /**
         * 饿汉模式打印第一次的Sun对象:org.hqw.designpattern.creatingpattern.singleton.Sun@1b6d3586
         * 饿汉模式打印第二次的Sun对象:org.hqw.designpattern.creatingpattern.singleton.Sun@1b6d3586
         */

        /* 懒汉模式测试 */
        System.out.println("懒汉模式打印第一次的Sun对象:" + LazySingleTon.getSun());
        System.out.println("懒汉模式打印第二次的Sun对象:" + LazySingleTon.getSun());
        /**
         * 懒汉模式打印第一次的Sun对象:org.hqw.designpattern.creatingpattern.singleton.Sun@4554617c
         * 懒汉模式打印第二次的Sun对象:org.hqw.designpattern.creatingpattern.singleton.Sun@4554617c
         */

    }
}
