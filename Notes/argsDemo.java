package Notes;

public class argsDemo {
    public static void main(String[] args) { //���򴫲�
        for(String arg:args){
            if(arg.equals("--ver"))
                System.out.println("version: 1.0.0");
        }
        System.out.println("Hello world!");
    }
}
//���У�Ȼ�����д����е��������㣬�޸��������ã�����ʵ������--ver��
// �ٵ���������ߵ����а�ť���ͻ����version: 1.0.0