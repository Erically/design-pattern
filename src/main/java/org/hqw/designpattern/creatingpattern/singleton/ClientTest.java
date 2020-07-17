package org.hqw.designpattern.creatingpattern.singleton;

public class ClientTest {
    public static void main(String[] args) {
        /* 饿汉模式测试 */
        System.out.println("打印第一次的Sun对象:" + HungrySingleton.getSun());
        System.out.println("打印第二次的Sun对象:" + HungrySingleton.getSun());
        /**
         * org.hqw.designpattern.creatingpattern.singleton.Sun@1b6d3586
         * org.hqw.designpattern.creatingpattern.singleton.Sun@1b6d3586
         */

        /* 饿汉模式测试 */
    }
}
