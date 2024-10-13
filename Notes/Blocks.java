package Notes;

public class Blocks {
    public static void main(String[] args) {
        System.out.println(Studentt.num);
        System.out.println(Studentt.num);//只执行一次
        System.out.println(Studentt.school);//初始化了
        System.out.println("==============");
        Studentt s1=new Studentt();
        Studentt s2=new Studentt("Tom");
    }
}
// 静态代码块
// 1. 静态代码块是在类加载时执行的，且只执行一次
// 2. 静态代码块可以用来初始化静态字段
// 3. 静态代码块不能访问非静态字段或实例方法
class Studentt{
    static int num=80;
    static String school;
    static {
        System.out.println("Studentt类的静态代码块执行");
        school="清华大学";
    }
    {
        System.out.println("Studentt类的实例代码块执行");
        System.out.println("对象"+this+"创建成功");
    }
    public Studentt() {
        System.out.println("Studentt类的无参构造方法执行");
    }
    public Studentt(String name) {
        System.out.println("Studentt类的有参构造方法执行");
    }
}
//实例代码块
//1. 实例代码块是在创建对象时执行的，每次创建对象都会在构造方法之前执行
//2. 实例代码块可以用来初始化实例字段，可以访问静态字段和实例字段
