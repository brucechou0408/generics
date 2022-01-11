package com.bruce.generics.demo5;


import java.util.List;

/**
 * @author bruce
 */
public class GenericsNumber<T extends Number> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public GenericsNumber(T key) {
        this.key = key;
    }

    public <F extends Number> void genericsNumberMethod(F... obj){
        T t = this.getKey();
        System.out.println("key is " + this.getKey());
        System.out.println("传入的参数是");
        for (F f : obj) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        GenericsNumber<Integer> genericsInteger = new GenericsNumber<Integer>(123);
        genericsInteger.genericsNumberMethod(1,2,3,5.5);
    }
}
