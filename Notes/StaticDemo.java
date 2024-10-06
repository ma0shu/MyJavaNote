package Notes;

public class StaticDemo {
    //01.静态字段
    //静态字段属于类，不属于实例
    //静态字段可以直接通过类名访问
    //静态字段在内存中只有一份，所有实例共享
    //静态字段可以在没有实例的情况下访问
    //静态字段的初始化顺序按照定义的顺序进行
    // 02.静态方法
    //静态方法属于类，不属于实例
    //静态方法可以直接通过类名访问
    //静态方法可以在没有实例的情况下调用
    //静态方法不能访问实例字段，因为静态方法没有this
    public static void main(String[] args)
    {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        person1.number = 88;
        person2.number = 99;
        System.out.println(person1.number);
        System.out.println(person2.number);//都是99！
        person1.run();
        PersonDemo.run();//上面其实等于下面
    }
}
class PersonDemo{
    public String name;
    public static int number;
    static void run(){
        System.out.println("run");
    }
    //Not OK:
//    static void run2(){
//        System.out.println("run2"+name);
//    }
}

