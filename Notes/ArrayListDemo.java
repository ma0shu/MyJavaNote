package Notes;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(66.66);
        list.add("OK");
        System.out.println(list);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("hello");
//      list2.add(66.66);
        list2.add("OK");
        System.out.println(list2);
        list.add(2,"world");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.remove("world"));
        //Ĭ��ɾ����һ�����ֵ�
        System.out.println(list.set(1,"do it"));
        //���ر��滻��ԭԪ��
    }
}
class ArrayListRemoveObj {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("���");
        list.add("�������");
        list.add("���");
        list.add("�����");
        list.add("���");
        list.add("�����");
        System.out.println(list);
        //��һ���������ɾ��
        for (int i = 0; i < list.size(); i++) {
            String elem=list.get(i);
            if(elem.contains("���"))
            {
                list.remove(elem);
                i--;
            }
        }
        System.out.println(list);
        //�������������ɾ��
        for (int i = list.size()-1; i >= 0; i--) {
            String elem=list.get(i);
            if(elem.contains("���"))
            {
                list.remove(elem);
            }
        }
    }
}

