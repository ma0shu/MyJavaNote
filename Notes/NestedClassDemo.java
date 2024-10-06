package Notes;

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer("Zhangsan");
        //��Ҫ�����ⲿ�����
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
        private int b=2;//�ڲ�����Զ������ⲿ��ͬ���ĳ�Ա
        public void hello(){
            System.out.println("hello,"+name);
        }//û����������ʡ��Outer.this
        public void showA(){
            System.out.println("Outer a from inner:"+Outer.this.a);
            System.out.println("inner a:"+a);
            System.out.println("Now change a to 2");
            a=2;
            System.out.println("Outer a from inner:"+Outer.this.a);
            System.out.println("inner a:"+a);
        }//�ڲ�����Է��ʡ��޸��ⲿ���˽�г�Ա
        public void showB(){
            System.out.println("Outer b from inner:"+Outer.this.b);
            System.out.println("inner b:"+b);
        }//�ڲ�����Է��ʡ��޸��ⲿ���˽�г�Ա
    }
    //�����static�����ڲ��࣬��ô
    //�޷�����Outer.this
    //���Է���Outer��private��̬�ֶκ;�̬����,���ڲ��������޸ĸñ�����ֵ
    //�ֲ����಻����ʹ�÷���Ȩ�����η� public private protected ��������
    //Outer.Inner innner=new Outer.Inner();
    //����Ҫ�ⲿ�����
}
