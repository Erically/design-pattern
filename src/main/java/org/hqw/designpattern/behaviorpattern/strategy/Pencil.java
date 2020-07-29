package org.hqw.designpattern.behaviorpattern.strategy;

/**
 * 用铅笔写字
 */
public class Pencil implements Writer{
    public void write(){
        System.out.println("To write by pencil!");
        return ;
    }
}
