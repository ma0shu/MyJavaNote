package Notes;

public class ExceptionThrowsDemo {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
//          throw new IllegalArgumentException();
            throw new IllegalArgumentException(e);
        }//�յ�process2��Number..Exception��
        // �׳�IllegalArgumentException
        //������ں��治����e���Ϳ�����ԭʼ�쳣��Ϣ�ˣ��Ҳ�������ԭ��
        finally{
            System.out.println("finally!");
        }//throw�쳣������Ӱ��finally��ִ��
        //�����finally��throw�쳣���Ḳ��/����ԭ�쳣
        //Ӧ�ã��������е��쳣��Ϣ��
        //����origin��������ԭʼ�쳣
        // Exception origin = null;
        // ...orgin=e;throw e;
        // Ȼ��finally����
        // if(origin!=null)e.addSuppressed(origin)
        // ��ԭʼ�쳣��ӽ���������׳���throw e
    }
    static void process2() {
        throw new NullPointerException();
    }
}
