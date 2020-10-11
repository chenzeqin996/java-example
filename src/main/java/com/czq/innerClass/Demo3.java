package com.czq.innerClass;

/**
 * 匿名内部类
 * @author: chenzeqin
 * @date: 2020/10/9
 */
public class Demo3 {
    private void test(final int i) {
        new Service() {
            public void method() {
                for (int j = 0; j < i; j++) {
                    System.out.println("匿名内部类" );
                }
            }
        }.method();
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.test(3);
    }
}
//匿名内部类必须继承或实现一个已有的接口
interface Service{
    void method();
}
