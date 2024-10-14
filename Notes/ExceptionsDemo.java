package Notes;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionsDemo {
    //Object{
    //  ����Throwable{
    //     ����Error//���ش��󣬳����޷���������Ҫ����
    //     ��  ���� StackOverflowError
    //     ��  ���� OutOfMemoryError...
    //     ����Exception//�쳣������Rt��Ҫ��ǿ�Ʋ���
    //        ���� RuntimeException//����ʱ�쳣����Ҫ��ǿ�Ʋ���
//            ��  ���� NullPointerException
//            ��  ���� IndexOutOfBoundsException
//            ��  ���� SecurityException
//            ��  ���� IllegalArgumentException
//            ��     ���� NumberFormatException
//            ���� IOException
//            ��  ���� UnsupportedCharsetException
//            ��  ���� FileNotFoundException
//            ��  ���� SocketException
//            ���� ParseException
//            ���� GeneralSecurityException
//            ���� SQLException
//            ���� TimeoutException
    //���벶����쳣������Exception�������࣬��ΪChecked Exception��
    //����Ҫ������쳣������Error�������࣬RuntimeException�������ࡣ
    //e.g.
    public static void main(String[] args) {
        try{
            byte[] bs = toGBK("����");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }//ע�����ͺ����и�Сe
    }
    /*
    static byte[] toGBK(String s) {
        return s.getBytes("GBK");
    }
    */
    //����������ʾδ������쳣�����벶�������
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
