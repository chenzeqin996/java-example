package com.czq.multiThread.dcl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单例模式Double Check Lock
 * @author: chenzeqin
 * @date: 2020/10/10
 */
public class DclDemo {
//    private static DclDemo dclDemo;
    private static volatile DclDemo dclDemo;

    public static DclDemo getInstance(){
        if(dclDemo==null){
            synchronized (DclDemo.class){
                if(dclDemo==null){
                    dclDemo = new DclDemo();
                }
            }
        }
        return dclDemo;
    }

    public static void main(String[] args) {
        for (int i=0; i<1000000000; i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(DclDemo.getInstance().hashCode());
                }
            }).start();
        }
    }
}
