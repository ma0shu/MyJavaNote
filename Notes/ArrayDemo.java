package Notes;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //��ƴ"psvm"����"main",�س�
        int ages[]={10,20,30,40,50};
        int[] ages2={10,20,30,40,50};   //����д���ȼ�
        System.out.println(ages.length);//��ƴsout,�س�
        String str[]={"can","you","hear","me","?"};
        int arr[];
        arr=new int[5];//����ֵĬ��0,String������Ĭ��null
        arr=new int[]{1,2,3,4,5};
        int arr2[]={5,4,3,2,1};
        arr2=arr; //������C,�����ǺϷ��ģ����������ã�ָ��ͬһ���ڴ�
                  //�޸�arr2��Ӱ��arr
        arr2=arr.clone(); //�������Ǹ���
    }
}
class ArraySortDemo { //��������
    public static void main(String[] args) {
        int[] arr={23,34,56,33,51,22,50};
        Arrays.sort(arr);//��ֱ����ԭ�������Ͻ�����������
        System.out.println(Arrays.toString(arr));
        //����
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        //�ַ�������Ҳ��
        String[] strarr={"hello","world","java","123","����"};
        Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));
    }
    public static void reverse(int[] arr){
        //����
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
