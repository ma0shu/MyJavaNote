package Notes;

public class Blocks {
    public static void main(String[] args) {
        System.out.println(Studentt.num);
        System.out.println(Studentt.num);//ִֻ��һ��
        System.out.println(Studentt.school);//��ʼ����
        System.out.println("==============");
        Studentt s1=new Studentt();
        Studentt s2=new Studentt("Tom");
    }
}
// ��̬�����
// 1. ��̬��������������ʱִ�еģ���ִֻ��һ��
// 2. ��̬��������������ʼ����̬�ֶ�
// 3. ��̬����鲻�ܷ��ʷǾ�̬�ֶλ�ʵ������
class Studentt{
    static int num=80;
    static String school;
    static {
        System.out.println("Studentt��ľ�̬�����ִ��");
        school="�廪��ѧ";
    }
    {
        System.out.println("Studentt���ʵ�������ִ��");
        System.out.println("����"+this+"�����ɹ�");
    }
    public Studentt() {
        System.out.println("Studentt����޲ι��췽��ִ��");
    }
    public Studentt(String name) {
        System.out.println("Studentt����вι��췽��ִ��");
    }
}
//ʵ�������
//1. ʵ����������ڴ�������ʱִ�еģ�ÿ�δ������󶼻��ڹ��췽��֮ǰִ��
//2. ʵ����������������ʼ��ʵ���ֶΣ����Է��ʾ�̬�ֶκ�ʵ���ֶ�
