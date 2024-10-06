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
        //默认删除第一个出现的
        System.out.println(list.set(1,"do it"));
        //返回被替换的原元素
    }
}
class ArrayListRemoveObj {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("枸杞");
        list.add("宁夏枸杞");
        list.add("红茶");
        list.add("红枸杞");
        list.add("茶包");
        list.add("紫枸杞");
        System.out.println(list);
        //法一：正序遍历删除
        for (int i = 0; i < list.size(); i++) {
            String elem=list.get(i);
            if(elem.contains("枸杞"))
            {
                list.remove(elem);
                i--;
            }
        }
        System.out.println(list);
        //法二：倒序遍历删除
        for (int i = list.size()-1; i >= 0; i--) {
            String elem=list.get(i);
            if(elem.contains("枸杞"))
            {
                list.remove(elem);
            }
        }
    }
}

