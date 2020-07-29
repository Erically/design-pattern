package org.hqw.designpattern.behaviorpattern.strategy;

/**
 * 用钢笔写字
 */
public class Pen implements Writer{
    public void write(){
        System.out.println("To write by pen!");
        return ;
    }
}
