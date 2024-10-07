package Notes;

import java.util.Random;
import java.util.HexFormat;

public class JavaToolsDemo {
    public static void main(String[] args) {
        //1.Math
        Math.abs(-7.8); // 7.8
        Math.max(100, 99); // 100
        Math.min(1.2, 2.3); // 1.2
        Math.pow(2, 10); // 2��10�η�=1024
        Math.sqrt(2); // 1.414...
        Math.exp(2); // 7.389...
        Math.log(4); // ln4=2ln2=1.386...
        Math.log10(100); // 2
        Math.sin(3.14); // 0.00159...
        Math.cos(3.14); // -0.9999...
        Math.tan(3.14); // -0.0015...
        Math.asin(1.0); // 1.57079...
        Math.acos(1.0); // 0.0
        double pi = Math.PI; // 3.14159...
        double e = Math.E; // 2.7182818...
        Math.sin(Math.PI / 6); // sin(��/6) = 0.5
        double x = Math.random(); // x�ķ�Χ��[0,1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min; // y�ķ�Χ��[10,50)
        System.out.println(y);
        System.out.println((long)y);//����
        //2.Random
        Random r = new Random();//����������ʱ��������
        //�������SecureRandom
        r.nextInt(); // 2071575453,ÿ�ζ���һ��
        r.nextInt(10); // 5,����һ��[0,10)֮���int
        r.nextLong(); // 8811649292570369305,ÿ�ζ���һ��
        r.nextFloat(); // 0.54335...����һ��[0,1)֮���float
        r.nextDouble(); // 0.3716...����һ��[0,1)֮���double
        //3.HexFormat
        byte[] data = "Hello".getBytes();
        HexFormat hf = HexFormat.of();
        String hexData = hf.formatHex(data); // 48656c6c6f
        byte[] decodedData = hf.parseHex(hexData); // "Hello"
        // �ָ���Ϊ�ո����ǰ׺0x����д��ĸ:
        HexFormat hf2 = HexFormat.ofDelimiter(" ").withPrefix("0x").withUpperCase();
        hf2.formatHex("Hello".getBytes()); // 0x48 0x65 0x6C 0x6C 0x6F
    }
}
