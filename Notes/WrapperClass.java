package Notes;

public class WrapperClass {
    //��װ�ࣺ
    //1.������������û�з��������ܵ��÷���
    //2.�����������Ͳ���Ϊnull
    //Java���õ�8�ֻ����������Ͷ�Ӧ�İ�װ�ࣺ
    //byte -> Byte,short -> Short,long -> Long
    //float -> Float,double -> Double,boolean -> Boolean
    //char -> Character/String?int -> Integer
    public static void main(String[] args) {
        int i=100;
        //Integer n1=new Integer(i);//��ʱ���ᾯ��
        Integer n2=Integer.valueOf(i);//�Ƽ�
        System.out.println(n2.intValue());
        //�ַ���ת����
        Integer n3=Integer.parseInt("100");//OK
        System.out.println(Integer.toString(100)); // "100",��ʾΪ10����
        Integer n3h=Integer.parseInt("100",16);//��16���ƽ�����256
        System.out.println(Integer.toString(100, 16));//"64",��ʾΪ16����
        Integer n4=Integer.valueOf("100");//OK
        //�Զ�װ�� �Զ�����
        Integer n = 100; // �������Զ�ʹ��Integer.valueOf(int)
        int x = n; // �������Զ�ʹ��Integer.intValue()
        //ֻ�����ڱ���׶Σ�Ϊ�˷�����д����
        //С�Ŀ�ָ��null�쳣
        //���а�װ�඼�ǲ��ɱ�ģ�final
        //��װ��ġ�==���Ƚϵ��ǵ�ַ��equals�Ƚϵ���ֵ����Ҫ��==!
        //���ܶ���-128��127���������Ỻ�棬������ȣ����ǲ�Ҫ�������
        // booleanֻ������ֵtrue/false�����װ����ֻ��Ҫ����Boolean�ṩ�ľ�̬�ֶ�:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // int�ɱ�ʾ�����/��Сֵ:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long����ռ�õ�bit��byte����:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)
        // ����ת��ΪNumber:
        Number num = Integer.valueOf(999);
        // ��ȡbyte, int, long, float, double:
        byte b = num.byteValue();
        int nt = num.intValue();//long double float����ͬ��
        //�޷�������
        byte x1 = -1;
        byte x2 = 127;
        System.out.println(Byte.toUnsignedInt(x1)); // 255
        System.out.println(Byte.toUnsignedInt(x2)); // 127
        //short int longͬ��
    }
}
