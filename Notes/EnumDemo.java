package Notes;
enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
public class EnumDemo {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        //ö������Ϊ�������ͣ����ȽϿ�����==�������Ǳ���equals()
        String s = Weekday.SUN.name(); // "SUN"
        int n = Weekday.SUN.ordinal(); // 0
        //������switch
        //e.g.
        switch (day) {
            case MON, TUE, WED, THU, FRI -> System.out.println("Work at office!");
            case SAT, SUN -> System.out.println("Work at home!");
            default -> throw new RuntimeException("cannot process " + day);
        }
    }
    //��дenum
    enum Weekday {
        MON(1, "����һ"), TUE(2, "���ڶ�"), WED(3, "������"), THU(4, "������"), FRI(5, "������"), SAT(6, "������"), SUN(0, "������");
        public final int dayValue;
        private final String chinese;
        private Weekday(int dayValue, String chinese) {
            this.dayValue = dayValue;
            this.chinese = chinese;
        }
        @Override
        public String toString() {
            return this.chinese;
        }
    }
}