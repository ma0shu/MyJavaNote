package Notes;

public class isEqualDemo {
    public static void main(String[] args) {
        var s="hello";// == Strings s="hello"
        var i=100;
        //只要后面给了初始值，就可以统一用var（数组不行）
        String a="hello";
        String b="HELLO".toLowerCase();
        if(a!=null&&a.equals(b)){
            System.out.println("a equals b");
        }
        else{
            System.out.println("a not equals b");
        }
        //equals()方法比较的是内容，==比较的是地址
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        if(x==y)
            System.out.println("x equals y");
        else
            System.out.println("x not equals y");
        //浮点数比较要用Math.abs(x-y)<0.0000001
        if(Math.abs(x-y)<0.0000001)
            System.out.println("x equals y");
        else
            System.out.println("x not equals y");
    }
}
