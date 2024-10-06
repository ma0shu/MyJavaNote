package Notes;

public class StringDemo {
        public static void main(String[] args) {
            String s = "hello";
//            String a=new String();
//            String b=new String("hello");
//            String c=new String(new char[]{'h','e','l','l','o'});
//            String d=new String(new byte[]{1,2,3,4,5});
            String t = s;
            s = "world";
            System.out.println(t);// t是"hello"(对)还是"world(错)"?
            System.out.println("============");
            //char无论汉字英文都是两个字节，可以存储一个汉字，用unicode存
            //String是引用类型，char是基本数据类型
            String st=s+t;
            System.out.println(st);
            //String可以用加号连接，char用加号连接是ASCII码相加
            //或者直接System.out.println(s+t);
            System.out.println("============");
            String a="";
            String b=null;
            System.out.println(b==a); // null!=空串
            System.out.println("============");
            String[] names = {"ABC", "XYZ", "zoo"};
            String str = names[1];
            names[1] = "cat";
            System.out.println(str); // str是"XYZ"还是"cat"?
            System.out.println(s.length());//5
            System.out.println(s.charAt(0));//w
            System.out.println(s.equals(t));//false
            System.out.println(s.equalsIgnoreCase(t));//false
            System.out.println(s.substring(0,3));//wor
            System.out.println(s.substring(3));//ld
            //trim()方法可以移除字符串首尾空白字符(包括" "，"\t"，"\r"，"\n")
            String s5 = "  hello world   ";
            System.out.println(s5.trim());
            //strip()方法可以移除字符串首尾空白字符，包括全角空格
            "\u3000Hello\u3000".strip(); // "Hello"
            " Hello ".stripLeading(); // "Hello "
            " Hello ".stripTrailing(); // " Hello"
            //isBlank()方法判断字符串是否为空白字符串
            "".isBlank(); // true
            "  ".isBlank(); // true
            //isEmpty()方法判断字符串是否为空字符串
            "".isEmpty(); // true
            "  ".isEmpty(); // false
            char[] chs = s.toCharArray();
            String s1="hello";
            String s2="hello";
            String s3=new String("hello");
            String s4=new String("hello");
            System.out.println(s1==s2);//true
            System.out.println(s3==s4);//false
            String info="我爱你我爱你";
            System.out.println(info.replace("我","他"));
            //replaceFirst()方法只替换第一个匹配的字符串
            System.out.println(info.replaceFirst("我","他"));
            //replaceAll()方法支持使用正则表达式替换所有匹配的字符串
            System.out.println(info.replaceAll("我?你","他?我"));
            System.out.println(info.contains("爱"));
            System.out.println(info.startsWith("我"));
            System.out.println(info.endsWith("你"));
            System.out.println(info.indexOf("爱"));
            System.out.println(info.lastIndexOf("爱"));
            String list="请,v,我,50";
            list.split(",");//返回一个数组地址
            System.out.println(list);
            String[] arr={"a","b","c","d"};
            String sss=String.join("-",arr);
            //format和formatted:这玩意有点类似printf
            String s7="Hello %s, your age is %d!";
            System.out.println(s.formatted("张三",18));
            System.out.println(String.format("Hi %s, your score is %d!","张三",60));
            //判断相等(isEqualDemo.java同)
            String a1="a";
            String a2=a1+"b";
            String a3="ab";
            String a4="a"+"b";
            System.out.println(a2==a3);//false
            System.out.println(a3==a4);//true
            //=======
            String s11 = "hello";
            String s12 = "HELLO";
            s11 = s11.toUpperCase();
            System.out.println(s11==s12);//false
            System.out.println(s11.equals(s12));//true
            //忽略大小写：.equalsIgnoreCase()
            //类型转换：.toCharArray() .toString() .valueOf()
            //数字->字符串：
            String.valueOf(123); // "123"
            String.valueOf(true); // "true"
            String.valueOf(new Object()); // 类似java.lang.Object@636be97c
            //字符串->数字：
            int n1 = Integer.parseInt("123"); // 123
            int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
            boolean b1 = Boolean.parseBoolean("true"); // true
            boolean b2 = Boolean.parseBoolean("FALSE"); // false
            //字符串->字符数组：
            char[] cs = "Hello".toCharArray(); // String -> char[]
            String s = new String(cs); // char[] -> String
            cs[0]='X';
            System.out.println(s);//Hello,不会变，复制了一份
        }
    }
