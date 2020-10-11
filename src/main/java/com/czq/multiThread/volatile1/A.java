package com.czq.multiThread.volatile1;

/**
 * @author: chenzeqin
 * @date: 2020/10/10
 */
public class A {
    private boolean flag;

    public A() {
    }

    public A(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
