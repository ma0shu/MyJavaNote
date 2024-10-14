package Notes;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionsDemo {
    //Object{
    //    Throwable{
    //        Error{
    //            StackOverflowError
    //            OutOfMemoryError...
    //        }//���ش��󣬳����޷�����
    //        Exception{
    //            RuntimeException{
    //                NullPointerException
    //                IndexOutOfBoundsException
    //                IllegalArgumentException...
    //            }//����ʱ�쳣���޸�����
    //            IOException{
    //                FileNotFoundException
    //                SocketException...
    //            }//IO�쳣,Ӧ�ò��񲢴���
    //            SQLException...
    //        }
    //    }
    //}
    //���벶����쳣������Exception�������࣬��������RuntimeException�������࣬
    // �������͵��쳣��ΪChecked Exception��
    //����Ҫ������쳣������Error�������࣬RuntimeException�������ࡣ
    //e.g.
    public static void main(String[] args) {
        try{
            byte[] bs = toGBK("����");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }
    /*
    static byte[] toGBK(String s) {
        return s.getBytes("GBK");
    }
    */
    //����������ʾδ�������쳣�����벶�������
    //������ΪString.getBytes(String)����������
    //public byte[] getBytes(...) throws UnsupportedEncodingException {
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
    //����������쳣�������ڷ���ǩ�����������쳣�������÷��ڵ���ʱ�ͱ��벶����쳣�����Ϸ�main
    //��main������throws Exception�����貶�񡣴�����һ�������쳣����������˳�
    //���Ҫ�Ӻ����ﲶ��
    /*
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        try{
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
    */
    //�����쳣�����Ե���printStackTrace()������ӡ�쳣ջ��
}