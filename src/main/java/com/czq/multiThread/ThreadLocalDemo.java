package com.czq.multiThread;

/**
 * @author: chenzeqin
 * @date: 2020/10/9
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<Person> tl = new ThreadLocal<Person>();
        Person p = new Person();
        tl.set(p);
        Person p2 = tl.get();
        System.out.println(p == p2);
    }
}

class Person{
    private String name = "张三";
}
