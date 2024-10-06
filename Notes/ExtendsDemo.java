package Notes;

public class ExtendsDemo {
    public void main(String[] args) {
        Person2 p = new Person2();
        //Upcasting 向上转型
        Person2 p1 = new Student();

        Student s = new Student();
        Person2 p2 = s;

        Person2 p3 = (Student) s;
        //都是可以的，因为Student是Person的子类

        p1.setAge(20);//正确，
        // 如果Student覆写了setAge()方法，会调用Student的setAge()
        //如果不想调用Student的setAge()，可以用super.setAge()
        //或者在setAge()方法前加final，表示不允许覆写
        //或者在setAge()方法前加static或者private
        //p1.setScore(100);//错误，因为p1是Person类型，
        //Person没有setScore()方法

        //Downcasting 向下转型
        //Notes.Student s1=new Notes.Person();
        //Notes.Student s2=(Notes.Person)p2;
        //Notes.Student s3=p2;
        //都错误，因为Person是Student的父类
        if (p1 instanceof Student) {
            // 只有判断成功才会向下转型:
            Student s4 = (Student) p1;
            s4.getScore();// ok
        }
        //OR简洁版:
        if (p1 instanceof Student s5) {
            s5.getScore();// ok
        }
    }
    //final class Notes.Person{...}表示不可以被继承
    //实例字段同样可以用final修饰。用final修饰的字段在初始化后不能被修改。
    //class Notes.Person {
    //    public final String name = "Unamed";
    //}
    //p.name = "New Name"; -> compile error!
    //或者在构造方法中再初始化final字段，也可保证构造后不可修改
}
class Person2{
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person2{
    private int score;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    //private name和age无法被student访问，
    //改为protected就可以被子类访问
    String Name1=name;// this is OK
    String Name2=this.name;// this is OK
    String Name3=super.name;// this is also OK
    //super为父类的this
    //一般会自动识别
    //用途之一：父类没有无参构造函数，但子类默认会调用父类的无参构造函数
    //这时会报错，需要super(name,age)来调用父类的有参构造函数
}
//java17新特性：sealed
//sealed class Notes.Person permits Notes.Student,Teacher{...}
//这样就只能有Student和Teacher两个子类继承，其他类无法继承