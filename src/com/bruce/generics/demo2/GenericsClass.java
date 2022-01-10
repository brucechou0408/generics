package com.bruce.generics.demo2;

/**
 * @author bruce
 */
public class GenericsClass<TF> {

    /**
     * 泛型标识可以是任何符号，通常使用的是T,E、K、V
     */
    private TF key;

    public GenericsClass(TF key) {
        this.key = key;
    }

    public TF getKey() {
        return key;
    }

    public void setKey(TF key) {
        this.key = key;
    }
}
