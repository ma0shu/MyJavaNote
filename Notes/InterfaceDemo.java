package Notes;

public class InterfaceDemo {
    //�ӿ�����ȫ����ģ�������ʵ���ֶ�
    //�ӿڿ��Զ��徲̬�ֶΣ���̬�ֶα���Ϊfinal
    //�ӿڵ��ֶ�ֻ����public static final���ͣ�����ʡ��
    //�ӿڿ��Զ���default/static������������ʵ��
    //�ӿڵķ���ֻ����public abstract���ͣ�����ʡ��
    interface hello{
        void hello();
    }
    interface Person extends hello{
        //�ӿڿ��Զ���default������default����������ʵ��
        //default�ͳ��������ͨ�������ǳ��󣩲�ͬ��
        //interface���ֶΣ�default�����޷������ֶΣ�
        //�����������ͨ�������Է���ʵ���ֶΡ�
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
    //һ����ֻ�ܼ̳�����һ���࣬���ܴӶ����̳�
    // ����һ�������ʵ�ֶ��interface����ֱ��дimplements A,B
    //�ӿڿ��Լ̳нӿڣ����ܼ̳���

}
