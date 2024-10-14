package Notes;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ExceptionCatchDemo {
    public static void main(String[] args) {
        String s="中文";
        try {
            toGBK(s);
        } catch (UnsupportedEncodingException | NumberFormatException e) {
            // 如果放在后面，永远捕获不到，后文详解；多个相同返回异常用|分隔
            System.out.println("Bad encoding");
        } catch (IOException e) {
            System.out.println("IO error");
        } //对于多个catch,匹配到某个catch后，执行catch代码块，然后不再继续匹配。
        //UnsupportedEncodingException是IOException的子类，会被catch (IOException e)捕获并执行。
        //因此必须把子类异常放到父类异常前面，否则永远捕获不到。
        //如果throws了，可以不捕获，但是调用者必须捕获。
        //finally语句块保证有无错误都会执行。
        // finally语句不是必须的，可写可不写，且总是最后执行。
        finally {
            System.out.println("END");
        }
    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }

}
