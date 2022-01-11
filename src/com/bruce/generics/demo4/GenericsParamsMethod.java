package com.bruce.generics.demo4;

/**
 * @author bruce
 */
public class GenericsParamsMethod {

    public <T> void manyObj(T... obj) {
        for (T t : obj) {
            System.out.println("t的类型是："+t.getClass()+"——————t的值是："+t);
        }
    }

    public static void main(String[] args) {
        new GenericsParamsMethod().manyObj("1",2,3L,'4',4.5,5.5f);
    }
}
