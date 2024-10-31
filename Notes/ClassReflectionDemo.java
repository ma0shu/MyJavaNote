package Notes;

public class ClassReflectionDemo {
    Class cls1 = String.class;//1
    String s1 = (String) cls1.newInstance();
    String s2 = "Hello";
    Class cls2 = s1.getClass();//2
    Class cls3 = Class.forName("java.lang.Object");//3
    boolean sameClass = cls1 == cls2; // true


    static void printObjectInfo(Object obj) {
        Class cls = obj.getClass();
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null)
            System.out.println("Package name: " + cls.getPackage().getName());
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    public static void main(String[] args) {
        printObjectInfo("Hello".getClass());
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i2 : is) {
            System.out.println(i2);
        }
        Class ss = Integer.class.getSuperclass();
        Class[] iss = ss.getInterfaces();
        for (Class ii : iss) {
            System.out.println(ii);
        }
        //获取接口的父接口要用getInterfaces()
        //对所有interface的Class调用getSuperclass()返回的是null
        Object n1 = Integer.valueOf(123);
        boolean isDouble = n1 instanceof Double; // false
        boolean isInteger = n1 instanceof Integer; // true
        boolean isNumber = n1 instanceof Number; // true
        boolean isSerializable = n1 instanceof java.io.Serializable; // true
        //如果是两个Class实例，要判断一个向上转型是否成立，可以调用isAssignableFrom()：
        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number
        Integer.class.isAssignableFrom(Number.class); // false，因为Number不能赋值给Integer
    }
    public ClassReflectionDemo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    }
}
