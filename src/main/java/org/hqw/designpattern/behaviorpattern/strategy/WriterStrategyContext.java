package org.hqw.designpattern.behaviorpattern.strategy;

/**
 * 1.封装策略接口和其实现类，保护策略的实现
 */
public class WriterStrategyContext {
    /**
     * 面向接口编程，而不是实现
     */
    Writer writer;

    /**
     *
     * @param writer
     * 可在运行时动态改变写字的策略
     */
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    /**
     * 封装接口的方法，保护接口实现
     */
    public void perfromWriter(){
        this.writer.write();
    }
}
