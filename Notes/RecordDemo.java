package Notes;

public class RecordDemo {
    //记录类：
    //1. 用record定义的类是一个引用类型
    //2. 用record定义的类自动覆写了equals、hashCode、toString、getter、setter方法
    //3. 作用：定义class时使用final，无法派生子类；
    //每个字段使用final，保证创建实例后无法修改任何字段。
    record Point(int x, int y) {}
    public static void main(String[] args) {
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
        Point p2 = new Point(123, 456);
        System.out.println(p.equals(p2)); // true
        System.out.println(p == p2); // false
        System.out.println(p.hashCode() == p2.hashCode()); // true
    }
    //假设Point类的x、y不允许负数，需要Point的构造方法加上检查逻辑
    public record Point2(int x, int y) {
        public Point2 {
            if (x < 0 || y < 0)
                throw new IllegalArgumentException();
        }
    }
    //如果需要添加静态方法
    public record Point3(int x, int y) {
        public static Point3 of() {
            return new Point3(0, 0);
        }
        public static Point3 of(int x, int y) {
            return new Point3(x, y);
        }
    }
    Point3 z = Point3.of();
    Point3 p = Point3.of(123, 456);
}
