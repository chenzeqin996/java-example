package com.czq.multiThread.volatile1;

import java.util.concurrent.TimeUnit;

/**
 * @author: chenzeqin
 * @date: 2020/10/10
 */
public class Demo01 {
    public static volatile boolean flag = false;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                while(!flag){

                }
                System.out.println("success");
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                change();
            }
        }).start();

    }

    public static void change(){
        flag = true;
    }

}
