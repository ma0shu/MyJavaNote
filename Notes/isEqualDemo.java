package Notes;

public class isEqualDemo {
    public static void main(String[] args) {
        var s="hello";// == Strings s="hello"
        var i=100;
        //ֻҪ������˳�ʼֵ���Ϳ���ͳһ��var�����鲻�У�
        String a="hello";
        String b="HELLO".toLowerCase();
        if(a!=null&&a.equals(b)){
            System.out.println("a equals b");
        }
        else{
            System.out.println("a not equals b");
        }
        //equals()�����Ƚϵ������ݣ�==�Ƚϵ��ǵ�ַ
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        if(x==y)
            System.out.println("x equals y");
        else
            System.out.println("x not equals y");
        //�������Ƚ�Ҫ��Math.abs(x-y)<0.0000001
        if(Math.abs(x-y)<0.0000001)
            System.out.println("x equals y");
        else
            System.out.println("x not equals y");
    }
}
