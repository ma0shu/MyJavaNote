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
        System.out.println(i.longValue());//如果溢出，会丢失高位数据
        System.out.println(i.longValueExact());//溢出会报错
        //类似还有byteValue()short int long float double
        //可能精度损失或溢出
        //e.g. 999999pow99=Infinity
        //如果要求精确计算，或者浮点数，应该使用
        // BigDecimal
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); // 15241.55677489
        //scale表示小数位数，precision表示有效数字位数
        BigDecimal bd2 = new BigDecimal("123.4567");
        System.out.println(bd2.scale()); // 4
        System.out.println(bd2.precision()); // 7
        //stripTrailingZeros()方法可以将末尾的0去掉
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,因为去掉了00
        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2
        //setScale()方法可以设置小数位数
        BigDecimal d5 = bd2.setScale(2, RoundingMode.HALF_UP); // 四舍五入，123.46
        BigDecimal d6 = bd2.setScale(2, RoundingMode.DOWN); // 直接截断，123.45
        //compareTo()方法比较两个BigDecimal的大小
        BigDecimal d7 = new BigDecimal("123.45");
        BigDecimal d8 = new BigDecimal("123.4500");
        System.out.println(d7.compareTo(d8)); // 0
        //equals()方法比较两个BigDecimal是否相等
        System.out.println(d7.equals(d8)); // false
        //不但要求两个BigDecimal的值相等，还要求它们的scale()相等
        System.out.println(d7.equals(d8.stripTrailingZeros())); // true
        //add()方法做加法时，如果两个BigDecimal的scale不同，结果的scale是两者的scale较大值
        BigDecimal d13 = new BigDecimal("123.45");
        BigDecimal d14 = new BigDecimal("123.4500");
        BigDecimal d15 = d13.add(d14); // 246.9000
        //divide()方法做除法时，如果除不尽，就必须指定精确的小数位数
        BigDecimal d9 = new BigDecimal("123.45");
        BigDecimal d10 = new BigDecimal("20");
        BigDecimal d11 = d9.divide(d10, 3, RoundingMode.HALF_UP); // 6.172
        BigDecimal d12 = d9.divide(d10); // 报错，除不尽
        //divideAndRemainder()方法同时返回商和余数
        BigDecimal[] dr = d9.divideAndRemainder(d10);
        System.out.println(dr[0]);//6
        System.out.println(dr[1]);//3.45
        if(dr[1].signum()==0) System.out.println("整除");
    }

}
