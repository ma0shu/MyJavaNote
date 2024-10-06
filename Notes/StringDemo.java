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
            System.out.println(t);// t��"hello"(��)����"world(��)"?
            System.out.println("============");
            //char���ۺ���Ӣ�Ķ��������ֽڣ����Դ洢һ�����֣���unicode��
            //String���������ͣ�char�ǻ�����������
            String st=s+t;
            System.out.println(st);
            //String�����üӺ����ӣ�char�üӺ�������ASCII�����
            //����ֱ��System.out.println(s+t);
            System.out.println("============");
            String a="";
            String b=null;
            System.out.println(b==a); // null!=�մ�
            System.out.println("============");
            String[] names = {"ABC", "XYZ", "zoo"};
            String str = names[1];
            names[1] = "cat";
            System.out.println(str); // str��"XYZ"����"cat"?
            System.out.println(s.length());//5
            System.out.println(s.charAt(0));//w
            System.out.println(s.equals(t));//false
            System.out.println(s.equalsIgnoreCase(t));//false
            System.out.println(s.substring(0,3));//wor
            System.out.println(s.substring(3));//ld
            //trim()���������Ƴ��ַ�����β�հ��ַ�(����" "��"\t"��"\r"��"\n")
            String s5 = "  hello world   ";
            System.out.println(s5.trim());
            //strip()���������Ƴ��ַ�����β�հ��ַ�������ȫ�ǿո�
            "\u3000Hello\u3000".strip(); // "Hello"
            " Hello ".stripLeading(); // "Hello "
            " Hello ".stripTrailing(); // " Hello"
            //isBlank()�����ж��ַ����Ƿ�Ϊ�հ��ַ���
            "".isBlank(); // true
            "  ".isBlank(); // true
            //isEmpty()�����ж��ַ����Ƿ�Ϊ���ַ���
            "".isEmpty(); // true
            "  ".isEmpty(); // false
            char[] chs = s.toCharArray();
            String s1="hello";
            String s2="hello";
            String s3=new String("hello");
            String s4=new String("hello");
            System.out.println(s1==s2);//true
            System.out.println(s3==s4);//false
            String info="�Ұ����Ұ���";
            System.out.println(info.replace("��","��"));
            //replaceFirst()����ֻ�滻��һ��ƥ����ַ���
            System.out.println(info.replaceFirst("��","��"));
            //replaceAll()����֧��ʹ��������ʽ�滻����ƥ����ַ���
            System.out.println(info.replaceAll("��?��","��?��"));
            System.out.println(info.contains("��"));
            System.out.println(info.startsWith("��"));
            System.out.println(info.endsWith("��"));
            System.out.println(info.indexOf("��"));
            System.out.println(info.lastIndexOf("��"));
            String list="��,v,��,50";
            list.split(",");//����һ�������ַ
            System.out.println(list);
            String[] arr={"a","b","c","d"};
            String sss=String.join("-",arr);
            //format��formatted:�������е�����printf
            String s7="Hello %s, your age is %d!";
            System.out.println(s.formatted("����",18));
            System.out.println(String.format("Hi %s, your score is %d!","����",60));
            //�ж����(isEqualDemo.javaͬ)
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
            //���Դ�Сд��.equalsIgnoreCase()
            //����ת����.toCharArray() .toString() .valueOf()
            //����->�ַ�����
            String.valueOf(123); // "123"
            String.valueOf(true); // "true"
            String.valueOf(new Object()); // ����java.lang.Object@636be97c
            //�ַ���->���֣�
            int n1 = Integer.parseInt("123"); // 123
            int n2 = Integer.parseInt("ff", 16); // ��ʮ������ת����255
            boolean b1 = Boolean.parseBoolean("true"); // true
            boolean b2 = Boolean.parseBoolean("FALSE"); // false
            //�ַ���->�ַ����飺
            char[] cs = "Hello".toCharArray(); // String -> char[]
            String s = new String(cs); // char[] -> String
            cs[0]='X';
            System.out.println(s);//Hello,����䣬������һ��
        }
    }
