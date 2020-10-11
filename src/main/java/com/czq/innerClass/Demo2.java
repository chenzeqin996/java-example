package com.czq.innerClass;

/**
 * 局部内部类：定义在方法中的内部类
 * @author: chenzeqin
 * @date: 2020/10/9
 */
public class Demo2 {
    private int out_a = 1;
    private static int STATIC_b = 2;

    public void testFunctionClass(){
        int inner_c =3;
        class Inner {
            private void fun(){
                System.out.println(out_a);
                System.out.println(STATIC_b);
                //System.out.println(inner_c);   // 编译错误inner_c必须定义为final
            }
        }
        Inner  inner = new Inner();
        inner.fun();
    }
    public static void testStaticFunctionClass(){
        int  d =3;
        class Inner {
            private void fun(){
                //System.out.println(out_a); //编译错误，定义在静态方法中的局部类不可以访问外部类的实例变量
                System.out.println(STATIC_b);
                //System.out.println(d);     // 编译错误d必须定义为final
            }
        }
        Inner inner = new Inner();
        inner.fun();
    }
}
