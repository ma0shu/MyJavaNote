package Notes;

import java.util.Arrays;
public class ForLoopInArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        //c 格式 for
        for (int i = 0; i < arr.length; i++) {
            //arr.length 是数组自带的长度
            //快捷输入：arr.fori，回车
            System.out.println("i=" + i + ",arr[i]=" + arr[i] + ",sum=" + sum);
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("============");
        //foreach
        sum = 0;
        for (int x : arr) {
            System.out.println("x=" + x + ",sum=" + sum);
            sum += x;
        }
        System.out.println(sum);
        System.out.println("============");
        //Arrays.toString()
        //前面要加 'import java.util.Arrays;'
        System.out.println(Arrays.toString(arr));
        //输出格式 [1, 2, 3, 4, 5]
        System.out.println("============");
        //多维数组
        int[][] arrn = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arrn.length);//3
        System.out.println("=========");
        for (int[] arr1 : arrn) {
            for (int i : arr1) {
                //System.out.println(i);
                //println会自动换行
                System.out.print(i+" ");
                //print不会自动换行
            }
        }
        System.out.println("\n==========");
        System.out.println(Arrays.deepToString(arrn));
        //注意是deep,输出格式 [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
