package Notes;

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Zhangsan");
        //需要先有外部类对象
        Outer.Inner inner = outer.new Inner();
        outer.showA();
        inner.showA();
        outer.showB();
        inner.showB();
    }
}
class Outer{
    private int a=1;
    private int b=1;
    private String name;
    Outer(String name){
        this.name=name;
    }
    public void showA(){
        System.out.println("outer a:"+a);
    }
    public void showB(){
        System.out.println("outer b:"+b);
    }
    class Inner {
        private int b=2;//内部类可以定义与外部类同名的成员
        public void hello(){
            System.out.println("hello,"+name);
        }//没有重名可以省略Outer.this
        public void showA(){
            System.out.println("Outer a from inner:"+Outer.this.a);
            System.out.println("inner a:"+a);
            System.out.println("Now change a to 2");
            a=2;
            System.out.println("Outer a from inner:"+Outer.this.a);
            System.out.println("inner a:"+a);
        }//内部类可以访问、修改外部类的私有成员
        public void showB(){
            System.out.println("Outer b from inner:"+Outer.this.b);
            System.out.println("inner b:"+b);
        }//内部类可以访问、修改外部类的私有成员
    }
    //如果用static修饰内部类，那么
    //无法引用Outer.this
    //可以访问Outer的private静态字段和静态方法,但内部不允许修改该变量的值
    //局部内类不允许使用访问权限修饰符 public private protected 均不允许
    //Outer.Inner innner=new Outer.Inner();
    //不需要外部类对象
}
