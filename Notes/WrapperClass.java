package Notes;

public class WrapperClass {
    //包装类：
    //1.基本数据类型没有方法，不能调用方法
    //2.基本数据类型不能为null
    //Java内置的8种基本数据类型对应的包装类：
    //byte -> Byte,short -> Short,long -> Long
    //float -> Float,double -> Double,boolean -> Boolean
    //char -> Character/String?int -> Integer
    public static void main(String[] args) {
        int i=100;
        //Integer n1=new Integer(i);//过时，会警告
        Integer n2=Integer.valueOf(i);//推荐
        System.out.println(n2.intValue());
        //字符串转整数
        Integer n3=Integer.parseInt("100");//OK
        System.out.println(Integer.toString(100)); // "100",表示为10进制
        Integer n3h=Integer.parseInt("100",16);//按16进制解析，256
        System.out.println(Integer.toString(100, 16));//"64",表示为16进制
        Integer n4=Integer.valueOf("100");//OK
        //自动装箱 自动拆箱
        Integer n = 100; // 编译器自动使用Integer.valueOf(int)
        int x = n; // 编译器自动使用Integer.intValue()
        //只发生在编译阶段，为了方便少写代码
        //小心空指针null异常
        //所有包装类都是不可变的，final
        //包装类的“==”比较的是地址，equals比较的是值，不要用==!
        //可能对于-128到127的整数，会缓存，所以相等，但是不要依赖这个
        // boolean只有两个值true/false，其包装类型只需要引用Boolean提供的静态字段:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // int可表示的最大/最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long类型占用的bit和byte数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)
        // 向上转型为Number:
        Number num = Integer.valueOf(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int nt = num.intValue();//long double float类似同理
        //无符号整型
        byte x1 = -1;
        byte x2 = 127;
        System.out.println(Byte.toUnsignedInt(x1)); // 255
        System.out.println(Byte.toUnsignedInt(x2)); // 127
        //short int long同理
    }
}
