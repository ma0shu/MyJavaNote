package Notes;

public class StaticDemo {
    //01.��̬�ֶ�
    //��̬�ֶ������࣬������ʵ��
    //��̬�ֶο���ֱ��ͨ����������
    //��̬�ֶ����ڴ���ֻ��һ�ݣ�����ʵ������
    //��̬�ֶο�����û��ʵ��������·���
    //��̬�ֶεĳ�ʼ��˳���ն����˳�����
    // 02.��̬����
    //��̬���������࣬������ʵ��
    //��̬��������ֱ��ͨ����������
    //��̬����������û��ʵ��������µ���
    //��̬�������ܷ���ʵ���ֶΣ���Ϊ��̬����û��this
    public static void main(String[] args)
    {
        PersonDemo person1 = new PersonDemo();
        PersonDemo person2 = new PersonDemo();
        person1.number = 88;
        person2.number = 99;
        System.out.println(person1.number);
        System.out.println(person2.number);//����99��
        person1.run();
        PersonDemo.run();//������ʵ��������
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

