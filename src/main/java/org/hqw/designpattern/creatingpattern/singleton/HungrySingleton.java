package org.hqw.designpattern.creatingpattern.singleton;

/**
 * 饿汉模式
 * 1.线程安全
 * 2.因为很饿，所以加载HungrySingleton类时就实例化其包含的类
 */
public class HungrySingleton {
    /* 禁止直接访问此属性 */
    private static Sun sun = new Sun("circle");

    /* 禁止被外部实例化本类 */
    /**
     * 1.如果能被实例化，则先自己被实例化，再获取实例化的内部对象，会显得更麻烦，所以禁止实例化本类
     * 2.通过静态方法来暴露内部对象
     * */
    private HungrySingleton(){}

    public static Sun getSun(){
        return sun;
    }

}