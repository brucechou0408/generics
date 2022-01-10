package com.bruce.generics.demo3;

/**
 * 实现泛型接口，未传入泛型实参
 * @author bruce
 */
public class GenericsImplementOfNoGenericsParams<T> implements GenericsInterface<T>{
    @Override
    public T next() {
        return null;
    }
}
/**
 * 如果不声明泛型，编译器会报错
 */
//public class GenericsImplementOfNoGenericsParams implements GenericsInterface<T>{
//    @Override
//    public T next() {
//        return null;
//    }
//}
