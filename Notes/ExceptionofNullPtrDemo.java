package Notes;

import java.util.Optional;

public class ExceptionofNullPtrDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toLowerCase());
        } catch (NullPointerException e) {
            e.printStackTrace();//��Ҫ��catch{}ֱ�������쳣
        }
        //��ϰ�ߣ�1.��ʼ��s="";�մ�����null
        //public String[] readLinesFromFile(String file) {
        //    if (getFileSize(file) == 0) {
        //        return new String[0];
        //    } // 2.���ؿ����������null
        //}
        //3.������÷�һ��Ҫ����null�жϣ�e.g.����null��ʾ�ļ������ڣ�
        // ���Ƿ���Optional<T>,�������÷�����ͨ��Optional.isPresent()�ж��Ƿ��н����
//        public Optional<String> readFromFile(String file) {
//            if (!fileExist(file)) {
//                return Optional.empty();
//            }
//        }
    }
}
