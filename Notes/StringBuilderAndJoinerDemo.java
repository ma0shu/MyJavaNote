package Notes;

import java.util.StringJoiner;

public class StringBuilderAndJoinerDemo {
    //作用：用于字符串的拼接
    //===String Builder实现===
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
        //====String Joiner实现===
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
        //====String Builder一些用法===
        StringBuilder sb2=new StringBuilder(100);
        sb2.append("Mr.");
        sb2.append("Smith");
        sb2.append("!");
        sb2.insert(0,"Hello ");
        sb2.delete(6,13);
        sb2.replace(6,11,"Jack");
        System.out.println(sb2);
        //不需要指定“开头”和“结尾”的时候，用String.join()更方便：
        //        var sj = new StringJoiner(", ");
        //        for (String name : names) {
        //            sj.add(name);
        //        }
        //        System.out.println(sj.toString());
        //ShortVer:
        var ssr = String.join(", ", names);
    }
}
