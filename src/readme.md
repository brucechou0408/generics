# 1. 什么是泛型 #
泛型，即“参数化类型”。 一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么参数化类型怎么理解呢？顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）。

泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。也就是说在泛型使用过程中，操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。
***
# 2. 特性 #
泛型只在编译阶段生效。见[Demo1](./com/bruce/generics/demo1/Demo.java)。
可见在程序编译后，会采取去泛型化的操作，泛型只在编译阶段生效，在编译阶段后会去除相关的信息，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法（可以参考如下的图片[demo1](./resources/demo1.png)）。
***
# 3. 泛型的使用 #
泛型有三种使用方式，分别为**泛型类**、**泛型接口**、**泛型方法**。
***
## 3.1. 泛型类 ##
泛型类型用于类的定义中，被称为泛型类。通过泛型可以完成对一组类的操作对外开放相同的接口。最典型的就是各种容器类，如：List、Set、Map。
```
    public class 类名称 <泛型标识>{
        private 泛型标识 变量；
    }
```
示例

[泛型类](./com/bruce/generics/demo2/GenericsClass.java)

[测试类](./com/bruce/generics/demo2/GenericsClassTest.java)

[相关字节码](./resources/demo2.png)

***注意点！！***

1. 泛型传入的参数类型不能是基本类型，如byte、short、int、long、float、double、char、boolean。
2. 不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
```
boolean flag = ex instanceof GenericsClass<Number>;
```
***
## 3.2. 泛型接口 ##
泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中，可以看一个例子：

[泛型接口类](./com/bruce/generics/demo3/GenericsInterface.java)

[泛型接口有泛型参数实现类](./com/bruce/generics/demo3/GenericsImplementOfGenericsParams.java)

[泛型接口无泛型参数实现类](./com/bruce/generics/demo3/GenericsImplementOfNoGenericsParams.java)
## 3.3. 泛型方法
java中泛型类的定义比较简单，但是泛型方法比较复杂。
下面是一个泛型方法的示例

[泛型方法](./com/bruce/generics/demo4/GenericsMethod.java)
[泛型方法可变参数](./com/bruce/generics/demo4/GenericsParamsMethod.java)

**小tip**

1. public与返回值之间的`<T>`可以看作是泛型方法的声明。
2. 只有声明了`<T>`的方法才是泛型方法，泛型类中使用泛型的成员方法不是泛型方法。
3. `<T>`表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型`T`。
4. 和泛型类的定义的一样，**T**也可以随便写写为任意标识，通常用**T**，**E**，**V**，**K**等参数表示泛型。
5. 静态方法使用泛型时，无法访问类定义上的泛型，需要将泛型定义在方法上。

***
# 4. 泛型通配符 #
我们知道Integer是Number的子类，那么在是在使用GenericsClass<Number>作为形参的方法中，可不可以使用GenericsClass<Integer>作为参数传入呢？
```
 public static void use(GenericsClass<Number> obj) {}
 public static void main(){
    use(new GenericsImplementOfNoGenericsParams<Integer>());
 }
```
可以看出，是不能的。由此可以看出，不同类型的泛型是不可以互相转换的，
但是实际运用的时候，我们不会给每个实现类都定义一个方法。于是类型通配符诞生了。我们可以修改use方法
```
    public static void use(GenericsClass<?> obj){}
```
此处的'?'是类型的实参， 不是类型形参，只使用Object中的功能时，可以通过?通配符来表示未知类型。



# 5. 泛型上下边界 #
在使用泛型的时候，我们还可以为传入的泛型实参进行上下边界限限制，比如只能传入某种类型的父类或者某种类型的子类。
+ 为泛型添加上边界，即传入的类型实参必须是指定类型的子类型
[示例](./com/bruce/generics/demo5/GenericsNumber.java)






