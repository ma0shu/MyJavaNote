package Notes;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //简拼"psvm"或者"main",回车
        int ages[]={10,20,30,40,50};
        int[] ages2={10,20,30,40,50};   //两种写法等价
        System.out.println(ages.length);//简拼sout,回车
        String str[]={"can","you","hear","me","?"};
        int arr[];
        arr=new int[5];//不赋值默认0,String等引用默认null
        arr=new int[]{1,2,3,4,5};
        int arr2[]={5,4,3,2,1};
        arr2=arr; //区别于C,这样是合法的，但是是引用，指向同一块内存
                  //修改arr2会影响arr
        arr2=arr.clone(); //这样才是复制
    }
}
class ArraySortDemo { //数组排序
    public static void main(String[] args) {
        int[] arr={23,34,56,33,51,22,50};
        Arrays.sort(arr);//会直接在原来数组上进行升序排序
        System.out.println(Arrays.toString(arr));
        //逆序
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        //字符串排序也行
        String[] strarr={"hello","world","java","123","中文"};
        Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));
    }
    public static void reverse(int[] arr){
        //逆序
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
