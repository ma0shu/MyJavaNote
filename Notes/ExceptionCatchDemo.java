package Notes;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ExceptionCatchDemo {
    public static void main(String[] args) {
        String s="����";
        try {
            toGBK(s);
        } catch (UnsupportedEncodingException | NumberFormatException e) {
            // ������ں��棬��Զ���񲻵���������⣻�����ͬ�����쳣��|�ָ�
            System.out.println("Bad encoding");
        } catch (IOException e) {
            System.out.println("IO error");
        } //���ڶ��catch,ƥ�䵽ĳ��catch��ִ��catch����飬Ȼ���ټ���ƥ�䡣
        //UnsupportedEncodingException��IOException�����࣬�ᱻcatch (IOException e)����ִ�С�
        //��˱���������쳣�ŵ������쳣ǰ�棬������Զ���񲻵���
        //���throws�ˣ����Բ����񣬵��ǵ����߱��벶��
        //finally���鱣֤���޴��󶼻�ִ�С�
        // finally��䲻�Ǳ���ģ���д�ɲ�д�����������ִ�С�
        finally {
            System.out.println("END");
        }
    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }

}
