package com.bruce.generics.demo1;


import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruce
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // 查看字节码文件是如何处理的
        list1.add("123");
        String str = list1.get(0);

        Class strListClass = list1.getClass();
        Class intListClass = list2.getClass();
        if (strListClass.equals(intListClass)) {
            System.out.println("泛型测试，类型相同");
        }

    }
}
