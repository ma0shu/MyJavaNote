package Notes;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class AnnocationDemo {
    //注释会被编译器直接忽略，注解则可以被编译器打包进入class文件
    // 因此，注解是一种用作标注的“元数据”。

    //第一类是由编译器使用的注解，例如：
    //@Override：让编译器检查该方法是否正确地实现了覆写；
    //@SuppressWarnings：告诉编译器忽略此处代码产生的警告。
    //这类注解不会被编译进入.class文件，它们在编译后就被编译器扔掉了。
    //第二类是由工具处理.class文件使用的注解，比如有些工具会在加载class的时候，对class做动态修改，实现一些特殊的功能。
    // 这类注解会被编译进入.class文件，但加载结束后并不会存在于内存中。
    // 这类注解只被一些底层库使用，一般我们不必自己处理。
    //第三类是在程序运行期能够读取的注解，它们在加载后一直存在于JVM中，这也是最常用的注解。例如，
    // 一个配置了@PostConstruct的方法会在调用构造方法后自动被调用（这是Java代码读取该注解实现的功能，JVM并不会识别该注解）

    //定义一个注解时，还可以定义配置参数。配置参数可以包括：
    //所有基本类型；String；枚举类型；基本类型、String、Class以及枚举的数组。
    //因为配置参数必须是常量，所以，上述限制保证了注解在定义时就已经确定了每个参数的值。
    //注解的配置参数可以有默认值，缺少某个配置参数时将使用默认值。
    //此外，大部分注解会有一个名为value的配置参数，对此参数赋值，可以只写常量，相当于省略了value参数。
    //如果只写注解，相当于全部使用默认值。
    //例如：
//    @Check(min=0, max=100, value=55)
//    public int n;
//    @Check(value=99)
//    public int p;
//    @Check(99) // =@Check(value=99)
//    public int x;
//    @Check
//    public int y;

    //Java语言使用@interface语法来定义注解（Annotation），它的格式如下：
//    public @interface Report {
//        int type() default 0;
//        String level() default "info";
//        String value() default "";
//    }
    //可以用default设定一个默认值（强烈推荐）。最常用的参数应当命名为value。
    //类或接口：ElementType.TYPE；
    //字段：ElementType.FIELD；
    //方法：ElementType.METHOD；
    //构造方法：ElementType.CONSTRUCTOR；
    //方法参数：ElementType.PARAMETER
//例如，定义注解@Report可用在方法上，我们必须添加一个@Target(ElementType.METHOD)：
//    @Target(ElementType.METHOD)
//    public @interface Report {
//        int type() default 0;
//
//        String level() default "info";
//
//        String value() default "";
//    }
//定义注解@Report可用在方法或字段上，可以把@Target注解参数变为数组{ ElementType.METHOD, ElementType.FIELD }：
//
//@Target({
//    ElementType.METHOD,
//    ElementType.FIELD
//})
//public @interface Report2 {
//    ...
//}
    //另一个重要的元注解@Retention定义了Annotation的生命周期：
    //
    //仅编译期：RetentionPolicy.SOURCE；
    //仅class文件：RetentionPolicy.CLASS；
    //运行期：RetentionPolicy.RUNTIME。
    //如果@Retention不存在，则该Annotation默认为CLASS。因为通常我们自定义的Annotation都是RUNTIME，所以，务必要加上@Retention(RetentionPolicy.RUNTIME)这个元注解：
    //
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Report {
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
//@Repeatable
//使用@Repeatable这个元注解可以定义Annotation是否可重复。这个注解应用不是特别广泛。
//
//@Repeatable(Reports.class)
//@Target(ElementType.TYPE)
//public @interface Report {
//    int type() default 0;
//    String level() default "info";
//    String value() default "";
//}
//@Target(ElementType.TYPE)
//public @interface Reports {
//    Report[] value();
//}
//经过@Repeatable修饰后，在某个类型声明处，就可以添加多个@Report注解：
//
//@Report(type=1, level="debug")
//@Report(type=2, level="warning")
//public class Hello {...
//}
// 使用@Inherited定义子类是否可继承父类定义的Annotation。
// @Inherited仅针对@Target(ElementType.TYPE)类型的annotation有效，
// 并且仅针对class的继承，对interface的继承无效：
    //@Inherited
    //@Target(ElementType.TYPE)
    //public @interface Report {
    //    int type() default 0;
    //    String level() default "info";
    //    String value() default "";
    //}
    //在使用的时候，如果一个类用到了@Report：
    //@Report(type=1)
    //public class Person {
    //}
    //则它的子类默认也定义了该注解：
    //public class Student extends Person {
    //}

    //必须设置@Target和@Retention，
    // @Retention一般设置为RUNTIME，因为我们自定义的注解通常要求在运行期读取。
    // 一般情况下，不必写@Inherited和@Repeatable
    public static void main(String[] args) {
        Class cls = Person.class;
        if (cls.isAnnotationPresent(Report.class)) {
            Report report = (Report)cls.getAnnotation(Report.class);
            int type = report.type();
        }
        //或者直接读，然后判断if (report != null) {...}
    }
    //读取方法参数的Annotation比较麻烦，因为方法参数本身可以看成一个数组，而每个参数又可以定义多个注解
    // 所以，一次获取方法参数的所有注解就必须用一个二维数组来表示
    //public void hello(@NotNull @Range(max=5) String name, @NotNull String prefix) {
    //}
    //// 获取Method实例:
    //Method m = ...
    //// 获取所有参数的Annotation:
    //Annotation[][] annos = m.getParameterAnnotations();
    //// 第一个参数（索引为0）的所有Annotation:
    //Annotation[] annosOfName = annos[0];
    //for (Annotation anno : annosOfName) {
    //    if (anno instanceof Range r) { // @Range注解
    //        r.max();
    //    }
    //    if (anno instanceof NotNull n) { // @NotNull注解
    //        //
    //    }
    //}
    //应用：
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Range {
        int min() default 0;
        int max() default 255;
    }
    public class Personp {
        @Range(min=1, max=20)
        public String name;

        @Range(max=10)
        public String city;
    }
    void check(Personp personp) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : personp.getClass().getFields()) {
            // 获取Field定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(personp);
                // 如果值是String:
                if (value instanceof String s) {
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }

}
