package Notes;
import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Object p = new Person("XiaoMing");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);//设置为true，可以访问private
        Object value = f.get(p);
        System.out.println(value); // "XiaoMing"
        f.set(p, "XiaoHong");
        System.out.println(f.get(p)); // "XiaoHong"
    }

}
