package Notes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerAndDemical {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));

        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780

        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue());//���������ᶪʧ��λ����
        System.out.println(i.longValueExact());//����ᱨ��
        //���ƻ���byteValue()short int long float double
        //���ܾ�����ʧ�����
        //e.g. 999999pow99=Infinity
        //���Ҫ��ȷ���㣬���߸�������Ӧ��ʹ��
        // BigDecimal
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); // 15241.55677489
        //scale��ʾС��λ����precision��ʾ��Ч����λ��
        BigDecimal bd2 = new BigDecimal("123.4567");
        System.out.println(bd2.scale()); // 4
        System.out.println(bd2.precision()); // 7
        //stripTrailingZeros()�������Խ�ĩβ��0ȥ��
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,��Ϊȥ����00
        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2
        //setScale()������������С��λ��
        BigDecimal d5 = bd2.setScale(2, RoundingMode.HALF_UP); // �������룬123.46
        BigDecimal d6 = bd2.setScale(2, RoundingMode.DOWN); // ֱ�ӽضϣ�123.45
        //compareTo()�����Ƚ�����BigDecimal�Ĵ�С
        BigDecimal d7 = new BigDecimal("123.45");
        BigDecimal d8 = new BigDecimal("123.4500");
        System.out.println(d7.compareTo(d8)); // 0
        //equals()�����Ƚ�����BigDecimal�Ƿ����
        System.out.println(d7.equals(d8)); // false
        //����Ҫ������BigDecimal��ֵ��ȣ���Ҫ�����ǵ�scale()���
        System.out.println(d7.equals(d8.stripTrailingZeros())); // true
        //add()�������ӷ�ʱ���������BigDecimal��scale��ͬ�������scale�����ߵ�scale�ϴ�ֵ
        BigDecimal d13 = new BigDecimal("123.45");
        BigDecimal d14 = new BigDecimal("123.4500");
        BigDecimal d15 = d13.add(d14); // 246.9000
        //divide()����������ʱ��������������ͱ���ָ����ȷ��С��λ��
        BigDecimal d9 = new BigDecimal("123.45");
        BigDecimal d10 = new BigDecimal("20");
        BigDecimal d11 = d9.divide(d10, 3, RoundingMode.HALF_UP); // 6.172
        BigDecimal d12 = d9.divide(d10); // ����������
        //divideAndRemainder()����ͬʱ�����̺�����
        BigDecimal[] dr = d9.divideAndRemainder(d10);
        System.out.println(dr[0]);//6
        System.out.println(dr[1]);//3.45
        if(dr[1].signum()==0) System.out.println("����");
    }

}
