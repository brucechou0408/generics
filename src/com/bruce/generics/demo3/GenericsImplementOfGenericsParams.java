package com.bruce.generics.demo3;

/**
 * 当传入泛型实参时，
 * 定义一个生产器实现这个接口，虽然我们只定义了一个泛型接口{@link com.bruce.generics.demo3.GenericsInterface}
 * 但是我们可以给T传入无数个实参，形成无数种类型的GenericsInterface接口。
 * 实现类在实现泛型接口时，如果给泛型类型传入实参类型，则所有使用泛型的地方都要替换传入的实参类型
 *
 * @author bruce
 */
public class GenericsImplementOfGenericsParams implements GenericsInterface<String> {

    @Override
    public String next() {
        return null;
    }
}
