package Notes;

public class DesignPattern {
    public static void main(String[] args) {
        //����ģʽ
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
    //����ʽ��ȷ��ֻ��һ��ʵ�������������ʱ�Ѿ�����ʵ��
    //˽��static��¼
    private static A a=new A();
    private A(){
        //˽�й�����
    }
    public static A getObject(){
        return a;
    }//����static����
}
class B{
    //����ʽ��ȷ��ֻ��һ��ʵ�������ڵ�һ�ε���ʱ����ʵ��
    private static B b;
    private B(){
        //˽�й�����
    }
    public static B getInstance(){
        if(b==null) {
            System.out.println("��һ�δ���B");
            b=new B();
        }
        return b;
    }
}