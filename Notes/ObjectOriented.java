package Notes;
//权限,报错
public class ObjectOriented {
    public static void main(String[] args) {
    Person Lisi=new Person();
    Lisi.setMoney(1000);
    Lisi.height=150;
    System.out.println(Lisi.getMoney());
    Person Zhangsan=new Person();
    Zhangsan.height=Lisi.height;
    //height(int)不是引用传递，是复制传递
        String newName="Zhangsanbefore";
        Zhangsan.setName(newName);
        newName="Zhangsanafter";
        System.out.println(Zhangsan.getName());
        //String是引用，但是String是不可变的，所以newName是新地址，name还是原来地址，不会改变
        String[] names={"zhangsan","lisi","wangwu"};
        Zhangsan.setName2(names);
        System.out.println(Zhangsan.getName2());
        names[0]="zhangsanNEW";
        System.out.println(Zhangsan.getName2());
        //这样会改，String[]是引用，aka引用参数绑定
        names=new String[]{"zhangsan","lisi","wangwu","zhaoliu"};
        System.out.println(Zhangsan.getName2());
        //这样不会改,new完还是指向原来的地址
    }
}
class Person{
    private int    age;   //不写private=public
    private int    money;
    int            height;
    private String name;//不用初始化，有默认值
    private String[] names;
    //getter和setter可以选中后右键，生成
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
        if(age<0||age>100){
            throw new IllegalArgumentException("非法输入：年龄必须在0-100之间");
        }
    }
    public int getMoney() {
        return this.money;//this表示当前对象，可以省略不写
    }
    /*
    public void setMoney(int money) {
        this.money = money;      //对
    }
    public void setMoney(int money) {
        money = money;           //错，重名
    }
    public void setMoney(int Money){
        money = Money;             //对，不重名即可，可以省略this
    }
    */
    public void setMoney(int money){
        if(money<0){
            throw new IllegalArgumentException("非法输入：钱数必须为正数");
        }
        this.money=money;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("非法输入：名字不能为空");
        }
        this.name=name;
    }
    public void setName2(String... Names){
        this.names=Names;
    }

    //这样就能传一个两个或者多个参数了
    //Zhangsan.setName2("zhangsan","lisi","wangwu");
    //而且杜绝传null的情况
    //用setName2(String[] names) 也行
    //但是要Zhangsan.setName2(new String[]{"zhangsan","lisi","wangwu"});
    //而且可以传null
    public String getName2(){
        return String.join(".",this.names);
    }
}