package Notes;

public class PermissionDemo {
    public static void main(String[] args) {
        //一、权限修饰符
        //private:私有的，只有本类可以访问
        //  private的成员变量和函数，只能在【本类】中访问，内部类也可以
        //default:默认的，只有本包可以访问
        //protected:受保护的，本包和【子类】可以访问
        //public:公共的，所有类都可以访问
        //package:没有修饰符
        //  只要在同一个包，就可以访问package权限的class、field和method
        //二、final
        //1.用final修饰class可以阻止被继承
        //2.用final修饰函数可以阻止被子类覆写
        //3.用final修饰成员变量、局部变量可以阻止被重新赋值
    }
}
class Hello {
    private final int n = 0;
    protected void hi() {
        //this.n = 1; // error!
    }
}
