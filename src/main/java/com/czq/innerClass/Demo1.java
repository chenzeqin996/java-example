package com.czq.innerClass;

/**
 * 成员内部类
 * @author: chenzeqin
 * @date: 2020/10/9
 */
public class Demo1 {

    private static  int radius = 1;
    private int count =2;

    class Inner {
        public void visit() {
            System.out.println("visit outer static  variable:" + radius);
            System.out.println("visit outer   variable:" + count);
        }
    }

    public static void main(String[] args) {


        Demo1 outer = new Demo1();
        Demo1.Inner inner = outer.new Inner();
        inner.visit();
    }
}
