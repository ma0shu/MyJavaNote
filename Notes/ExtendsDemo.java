package Notes;

public class ExtendsDemo {
    public void main(String[] args) {
        Person2 p = new Person2();
        //Upcasting ����ת��
        Person2 p1 = new Student();

        Student s = new Student();
        Person2 p2 = s;

        Person2 p3 = (Student) s;
        //���ǿ��Եģ���ΪStudent��Person������

        p1.setAge(20);//��ȷ��
        // ���Student��д��setAge()�����������Student��setAge()
        //����������Student��setAge()��������super.setAge()
        //������setAge()����ǰ��final����ʾ������д
        //������setAge()����ǰ��static����private
        //p1.setScore(100);//������Ϊp1��Person���ͣ�
        //Personû��setScore()����

        //Downcasting ����ת��
        //Notes.Student s1=new Notes.Person();
        //Notes.Student s2=(Notes.Person)p2;
        //Notes.Student s3=p2;
        //��������ΪPerson��Student�ĸ���
        if (p1 instanceof Student) {
            // ֻ���жϳɹ��Ż�����ת��:
            Student s4 = (Student) p1;
            s4.getScore();// ok
        }
        //OR����:
        if (p1 instanceof Student s5) {
            s5.getScore();// ok
        }
    }
    //final class Notes.Person{...}��ʾ�����Ա��̳�
    //ʵ���ֶ�ͬ��������final���Ρ���final���ε��ֶ��ڳ�ʼ�����ܱ��޸ġ�
    //class Notes.Person {
    //    public final String name = "Unamed";
    //}
    //p.name = "New Name"; -> compile error!
    //�����ڹ��췽�����ٳ�ʼ��final�ֶΣ�Ҳ�ɱ�֤����󲻿��޸�
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
    //private name��age�޷���student���ʣ�
    //��Ϊprotected�Ϳ��Ա��������
    String Name1=name;// this is OK
    String Name2=this.name;// this is OK
    String Name3=super.name;// this is also OK
    //superΪ�����this
    //һ����Զ�ʶ��
    //��;֮һ������û���޲ι��캯����������Ĭ�ϻ���ø�����޲ι��캯��
    //��ʱ�ᱨ����Ҫsuper(name,age)�����ø�����вι��캯��
}
//java17�����ԣ�sealed
//sealed class Notes.Person permits Notes.Student,Teacher{...}
//������ֻ����Student��Teacher��������̳У��������޷��̳�