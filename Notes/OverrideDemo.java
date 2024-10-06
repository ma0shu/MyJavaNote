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
        //�������ǩ������+�Σ���ͬ������Overload��Overload�������·�����
        //�������ǩ����ͬ�����ҷ���ֵҲ��ͬ������Override��
        //��������ͬ������������ͬ������������ֵ��ͬ��Ҳ�ǲ�ͬ�ķ�����
        //��������������������ᱨ��
        //����@Override�����ñ�������������Ƿ��������ȷ�ĸ�д��
        //ϣ�����и�д�����ǲ�С��д���˷���ǩ�����������ᱨ��
        //���ǲ���Ҳ���ԡ�
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
        p.run();//��� Notes.Student run
        AbstractClass ac = new AbstractClassImpl();
        ac.run();
    }
}
//AbstractDemo--������
//�����಻�ܱ�ʵ������ֻ�ܱ��̳�
//�������Ŀ����������ʵ�־��巽��
//��������԰����ֶ�
//���������û�г��󷽷������԰�����ͨ����
//���󷽷�ֻ�ܶ����ڳ�������
abstract class AbstractClass{
    public abstract void run();
}
class AbstractClassImpl extends AbstractClass{
    @Override
    public void run() {
        System.out.println("run");
    }
}
