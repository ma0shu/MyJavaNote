package Notes;

import java.lang.reflect.Constructor;

public class ReflectionConstructorDemo {
    public static void main(String[] args) throws Exception {
        // 获取构造方法Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法:
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);

        // 获取构造方法Integer(String)
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
        //getConstructor(Class...)：获取某个public的Constructor；
        //getDeclaredConstructor(Class...)：获取某个Constructor；
        //getConstructors()：获取所有public的Constructor；
        //getDeclaredConstructors()：获取所有Constructor。
        //注意Constructor总是当前类定义的构造方法，和父类无关，因此不存在多态的问题。
    }

}
