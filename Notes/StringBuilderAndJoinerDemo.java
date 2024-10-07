package Notes;

import java.util.StringJoiner;

public class StringBuilderAndJoinerDemo {
    //���ã������ַ�����ƴ��
    //===String Builderʵ��===
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // ע��ȥ������", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
        //====String Joinerʵ��===
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
        //====String BuilderһЩ�÷�===
        StringBuilder sb2=new StringBuilder(100);
        sb2.append("Mr.");
        sb2.append("Smith");
        sb2.append("!");
        sb2.insert(0,"Hello ");
        sb2.delete(6,13);
        sb2.replace(6,11,"Jack");
        System.out.println(sb2);
        //����Ҫָ������ͷ���͡���β����ʱ����String.join()�����㣺
        //        var sj = new StringJoiner(", ");
        //        for (String name : names) {
        //            sj.add(name);
        //        }
        //        System.out.println(sj.toString());
        //ShortVer:
        var ssr = String.join(", ", names);
    }
}
