package Notes;
//Ȩ��,����
public class ObjectOriented {
    public static void main(String[] args) {
    Person Lisi=new Person();
    Lisi.setMoney(1000);
    Lisi.height=150;
    System.out.println(Lisi.getMoney());
    Person Zhangsan=new Person();
    Zhangsan.height=Lisi.height;
    //height(int)�������ô��ݣ��Ǹ��ƴ���
        String newName="Zhangsanbefore";
        Zhangsan.setName(newName);
        newName="Zhangsanafter";
        System.out.println(Zhangsan.getName());
        //String�����ã�����String�ǲ��ɱ�ģ�����newName���µ�ַ��name����ԭ����ַ������ı�
        String[] names={"zhangsan","lisi","wangwu"};
        Zhangsan.setName2(names);
        System.out.println(Zhangsan.getName2());
        names[0]="zhangsanNEW";
        System.out.println(Zhangsan.getName2());
        //������ģ�String[]�����ã�aka���ò�����
        names=new String[]{"zhangsan","lisi","wangwu","zhaoliu"};
        System.out.println(Zhangsan.getName2());
        //���������,new�껹��ָ��ԭ���ĵ�ַ
    }
}
class Person{
    private int    age;   //��дprivate=public
    private int    money;
    int            height;
    private String name;//���ó�ʼ������Ĭ��ֵ
    private String[] names;
    //getter��setter����ѡ�к��Ҽ�������
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
        if(age<0||age>100){
            throw new IllegalArgumentException("�Ƿ����룺���������0-100֮��");
        }
    }
    public int getMoney() {
        return this.money;//this��ʾ��ǰ���󣬿���ʡ�Բ�д
    }
    /*
    public void setMoney(int money) {
        this.money = money;      //��
    }
    public void setMoney(int money) {
        money = money;           //������
    }
    public void setMoney(int Money){
        money = Money;             //�ԣ����������ɣ�����ʡ��this
    }
    */
    public void setMoney(int money){
        if(money<0){
            throw new IllegalArgumentException("�Ƿ����룺Ǯ������Ϊ����");
        }
        this.money=money;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("�Ƿ����룺���ֲ���Ϊ��");
        }
        this.name=name;
    }
    public void setName2(String... Names){
        this.names=Names;
    }

    //�������ܴ�һ���������߶��������
    //Zhangsan.setName2("zhangsan","lisi","wangwu");
    //���Ҷž���null�����
    //��setName2(String[] names) Ҳ��
    //����ҪZhangsan.setName2(new String[]{"zhangsan","lisi","wangwu"});
    //���ҿ��Դ�null
    public String getName2(){
        return String.join(".",this.names);
    }
}