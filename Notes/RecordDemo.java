package Notes;

public class RecordDemo {
    //��¼�ࣺ
    //1. ��record���������һ����������
    //2. ��record��������Զ���д��equals��hashCode��toString��getter��setter����
    //3. ���ã�����classʱʹ��final���޷��������ࣻ
    //ÿ���ֶ�ʹ��final����֤����ʵ�����޷��޸��κ��ֶΡ�
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
    //����Point���x��y������������ҪPoint�Ĺ��췽�����ϼ���߼�
    public record Point2(int x, int y) {
        public Point2 {
            if (x < 0 || y < 0)
                throw new IllegalArgumentException();
        }
    }
    //�����Ҫ��Ӿ�̬����
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
