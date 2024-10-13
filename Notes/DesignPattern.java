package Notes;

public class DesignPattern {
    public static void main(String[] args) {
        //单例模式
        //new A(); //ERROR
        A a1=A.getObject();
        A a2=A.getObject();
        System.out.println(a1==a2);
        B b1=B.getInstance();
        B b2=B.getInstance();
        System.out.println(b1==b2);
    }
}
class A{
    //饿汉式：确保只有一个实例，且在类加载时已经创建实例
    //私有static记录
    private static A a=new A();
    private A(){
        //私有构造器
    }
    public static A getObject(){
        return a;
    }//返回static对象
}
class B{
    //懒汉式：确保只有一个实例，且在第一次调用时创建实例
    private static B b;
    private B(){
        //私有构造器
    }
    public static B getInstance(){
        if(b==null) {
            System.out.println("第一次创建B");
            b=new B();
        }
        return b;
    }
}