package org.hqw.designpattern.behaviorpattern.strategy;

public class ClientTest {
    public static void main(String[] args) {
        /**
         * 为了保护策略接口，所以这里进行上下文封装
         */
        WriterStrategyContext writerStrategyContext = new WriterStrategyContext();

        writerStrategyContext.setWriter(new Pencil());
        writerStrategyContext.perfromWriter();

        writerStrategyContext.setWriter(new Pen());
        writerStrategyContext.perfromWriter();
    }
}
