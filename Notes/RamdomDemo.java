package Notes;

import java.util.Random;
public class RamdomDemo {//�����
    public static void main(String[] args) {
        Random rand=new Random();
        int randnum;
        for(int i=0;i<10;i++) {
            randnum = rand.nextInt(10);
            //����0-9������������ұ�
            System.out.println(randnum);
        }
        String str= """
                this
                is
                OK
                """;
        System.out.println(str);//��ӡ�����ַ���

        boolean b;
        //b=0;      x
        //b=FALSE;  x
        b=false;//����ֵ

    }
}
