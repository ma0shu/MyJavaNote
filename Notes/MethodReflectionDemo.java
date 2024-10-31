package Notes;

import java.lang.reflect.Method;

public class MethodReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student.class;
        // 获取public方法"score"，参数为int:
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        String s = "Hello world";
        // 获取String substring(int)方法，参数为int:
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果:
        //对Method实例调用invoke就相当于调用该方法，
        // invoke的第一个参数是对象实例，即在哪个实例上调用该方法，
        // 后面的可变参数要与方法参数一致，否则将报错。
        String r = (String) m.invoke(s, 6);
        // 打印调用结果:
        System.out.println(r); // "world"
        //调用静态方法
        // 获取Integer.parseInt(String)方法，参数为String:
        Method m2 = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        //调用静态方法时，由于无需指定实例对象，所以invoke方法传入的第一个参数永远为null
        Integer n = (Integer) m2.invoke(null, "12345");
        // 打印调用结果:
        System.out.println(n);
        //调用非public方法
        Person p = new Person();
        Method m3 = p.getClass().getDeclaredMethod("setName", String.class);
        m3.setAccessible(true);
        m3.invoke(p, "Bob");
        System.out.println(p.getName());
        //多态
        Method m4 = Person.class.getMethod("hello");
        m4.invoke(new Student());
        //相当于Person p = new Student();
        //p.hello();
    }
}