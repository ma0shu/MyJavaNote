package Notes;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Yes or No?");
        String option="yes";
        //switch�����÷�ͬc����
        switch(option){
            case "yes" -> System.out.println("yes");
            case "no" -> System.out.println("no");
            default -> System.out.println("default");
        }//�������break
        int i=switch(option){
            case "yes"->1;
            case "no"->2;
            default-> {
                System.out.println("default");
                yield 0;
            }//�������ֱ�ӷ���ֵ������
        };
    }
}
