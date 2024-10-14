package Notes;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionsDemo {
    //Object{
    //  └─Throwable{
    //     ├─Error//严重错误，程序无法处理，不需要捕获
    //     │  ├─ StackOverflowError
    //     │  └─ OutOfMemoryError...
    //     └─Exception//异常，除了Rt都要求强制捕获
    //        ├─ RuntimeException//运行时异常，不要求强制捕获
//            │  ├─ NullPointerException
//            │  ├─ IndexOutOfBoundsException
//            │  ├─ SecurityException
//            │  └─ IllegalArgumentException
//            │     └─ NumberFormatException
//            ├─ IOException
//            │  ├─ UnsupportedCharsetException
//            │  ├─ FileNotFoundException
//            │  └─ SocketException
//            ├─ ParseException
//            ├─ GeneralSecurityException
//            ├─ SQLException
//            └─ TimeoutException
    //必须捕获的异常，包括Exception及其子类，称为Checked Exception。
    //不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。
    //e.g.
    public static void main(String[] args) {
        try{
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }//注意类型后面有个小e
    }
    /*
    static byte[] toGBK(String s) {
        return s.getBytes("GBK");
    }
    */
    //编译器会提示未处理的异常，必须捕获或声明
    //这是因为String.getBytes(String)方法定义是
    //public byte[] getBytes(...) throws UnsupportedEncodingException {
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
    //如果不捕获异常，可以在方法签名处声明该异常，但调用方在调用时就必须捕获该异常，如上方main
    //把main类后面加throws Exception，无需捕获。代价是一旦发生异常程序会立刻退出
    //如果要从函数里捕获：
    /*
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        try{
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
    */
    //所有异常都可以调用printStackTrace()方法打印异常栈。
}
