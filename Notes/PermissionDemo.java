package Notes;

public class PermissionDemo {
    public static void main(String[] args) {
        //һ��Ȩ�����η�
        //private:˽�еģ�ֻ�б�����Է���
        //  private�ĳ�Ա�����ͺ�����ֻ���ڡ����ࡿ�з��ʣ��ڲ���Ҳ����
        //default:Ĭ�ϵģ�ֻ�б������Է���
        //protected:�ܱ����ģ������͡����ࡿ���Է���
        //public:�����ģ������඼���Է���
        //package:û�����η�
        //  ֻҪ��ͬһ�������Ϳ��Է���packageȨ�޵�class��field��method
        //����final
        //1.��final����class������ֹ���̳�
        //2.��final���κ���������ֹ�����าд
        //3.��final���γ�Ա�������ֲ�����������ֹ�����¸�ֵ
    }
}
class Hello {
    private final int n = 0;
    protected void hi() {
        //this.n = 1; // error!
    }
}
