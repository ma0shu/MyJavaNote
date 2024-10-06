package Notes;

public class OverrideDemo {
    static class Person{
        public void run(){
            System.out.println("Notes.Person run");
        }
    }
    static class Student extends Person{
        @Override
        public void run(){
            System.out.println("Notes.Student run");
        }
        //如果方法签名（名+参）不同，就是Overload，Overload方法是新方法；
        //如果方法签名相同，并且返回值也相同，就是Override。
        //方法名相同，方法参数相同，但方法返回值不同，也是不同的方法。
        //出现这种情况，编译器会报错。
        //加上@Override可以让编译器帮助检查是否进行了正确的覆写。
        //希望进行覆写，但是不小心写错了方法签名，编译器会报错。
        //但是不加也可以。
        public void run(String s){
            System.out.println("Notes.Student run2");
        }
//        public int run(){
//            System.out.println("Notes.Student run3");
//            return 0;
//        }
    }
    public static void main(String[] args) {
        Person p = new Student();
        p.run();//输出 Notes.Student run
        AbstractClass ac = new AbstractClassImpl();
        ac.run();
    }
}
//AbstractDemo--抽象类
//抽象类不能被实例化，只能被继承
//抽象类的目的是让子类实现具体方法
//抽象类可以包含字段
//抽象类可以没有抽象方法，可以包含普通方法
//抽象方法只能定义在抽象类中
abstract class AbstractClass{
    public abstract void run();
}
class AbstractClassImpl extends AbstractClass{
    @Override
    public void run() {
        System.out.println("run");
    }
}
