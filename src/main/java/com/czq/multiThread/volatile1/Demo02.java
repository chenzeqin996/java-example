package com.czq.multiThread.volatile1;

/**
 * @author: chenzeqin
 * @date: 2020/10/10
 */
public class Demo02 {
    private static volatile A a = new A(false);
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                while(!a.isFlag()){

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
                a.setFlag(true);
            }
        }).start();

    }


}
