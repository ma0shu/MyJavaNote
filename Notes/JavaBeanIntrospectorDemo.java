package Notes;

import java.beans.*;

public class JavaBeanIntrospectorDemo {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(PersonAll.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println(pd.getReadMethod());
            System.out.println(pd.getWriteMethod());
        }
    }
}

class PersonAll {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
