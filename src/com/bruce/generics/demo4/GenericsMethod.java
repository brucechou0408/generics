package com.bruce.generics.demo4;

import com.bruce.generics.demo3.GenericsInterface;

/**
 * @author bruce
 */
public class GenericsMethod {
    public static void main(String[] args) throws Exception {
        GenericsMethod genericsMethod = new GenericsMethod();
        String str = genericsMethod.genericsMethod(String.class);
        System.out.println(str instanceof String);
    }

    /**
     * @param tClass 传入的泛型实参
     * @param <T>
     * @return T 返回值为T类型
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public <T> T genericsMethod(Class<T> tClass) throws InstantiationException, IllegalAccessException {
        T t = tClass.newInstance();
        return t;
    }
}
