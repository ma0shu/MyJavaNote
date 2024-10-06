package Notes;

import java.util.Random;
public class RamdomDemo {//随机数
    public static void main(String[] args) {
        Random rand=new Random();
        int randnum;
        for(int i=0;i<10;i++) {
            randnum = rand.nextInt(10);
            //生成0-9的随机数，左开右闭
            System.out.println(randnum);
        }
        String str= """
                this
                is
                OK
                """;
        System.out.println(str);//打印换行字符串

        boolean b;
        //b=0;      x
        //b=FALSE;  x
        b=false;//布尔值

    }
}
