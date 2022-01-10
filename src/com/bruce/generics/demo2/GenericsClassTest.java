package com.bruce.generics.demo2;

public class GenericsClassTest {
    public static void main(String[] args) {
        // 测试传入泛型
        GenericsClass<String> genericsStr = new GenericsClass<>("123");
        GenericsClass<Integer> genericsInteger = new GenericsClass<>(123);
        System.out.println("泛型测试，key is:"+genericsStr.getKey());
        System.out.println("泛型测试，key is:"+genericsInteger.getKey());
        // 测试不传入泛型
        GenericsClass noGenericsStr = new GenericsClass("123");
        GenericsClass noGenericsInteger = new GenericsClass(123);
        GenericsClass noGenericsBoolean = new GenericsClass(true);
        GenericsClass noGenericsDouble = new GenericsClass(11.11);

        System.out.println("不传泛型测试，noGenericsStr key is:"+(String)noGenericsStr.getKey());
        System.out.println("不传泛型测试，noGenericsInt key is:"+(int)noGenericsInteger.getKey());
        System.out.println("不传泛型测试，noGenericsBoolean key is:"+(boolean)noGenericsBoolean.getKey());
        System.out.println("不传泛型测试，noGenericsDouble key is:"+(double)noGenericsDouble.getKey());

    }
}
