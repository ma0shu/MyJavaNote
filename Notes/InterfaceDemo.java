package Notes;

public class InterfaceDemo {
    //接口是完全抽象的，不能有实例字段
    //接口可以定义静态字段，静态字段必须为final
    //接口的字段只能是public static final类型，可以省略
    //接口可以定义default/static方法，可以有实现
    //接口的方法只能是public abstract类型，可以省略
    interface hello{
        void hello();
    }
    interface Person extends hello{
        //接口可以定义default方法，default方法可以有实现
        //default和抽象类的普通方法（非抽象）不同。
        //interface无字段，default方法无法访问字段，
        //而抽象类的普通方法可以访问实例字段。
        default void run(){
            System.out.println(getName()+"run");
        }
        String getName();
    }
    class Student implements Person{
        private String name;
        @Override
//        public void run() {
//            System.out.println(name+"run");
//        }
        public String getName() {
            return name;
        }
        public void hello(){
            System.out.println("hello");
        }
    }
    //一个类只能继承自另一个类，不能从多个类继承
    // 但是一个类可以实现多个interface，即直接写implements A,B
    //接口可以继承接口，不能继承类

}
