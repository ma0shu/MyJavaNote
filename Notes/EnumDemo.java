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
        //枚举类型为引用类型，但比较可以用==，而不是必须equals()
        String s = Weekday.SUN.name(); // "SUN"
        int n = Weekday.SUN.ordinal(); // 0
        //可以用switch
        //e.g.
        switch (day) {
            case MON, TUE, WED, THU, FRI -> System.out.println("Work at office!");
            case SAT, SUN -> System.out.println("Work at home!");
            default -> throw new RuntimeException("cannot process " + day);
        }
    }
    //覆写enum
    enum Weekday {
        MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
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