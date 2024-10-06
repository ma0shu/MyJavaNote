package Notes;

import java.util.Arrays;
public class ForLoopInArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        //c ��ʽ for
        for (int i = 0; i < arr.length; i++) {
            //arr.length �������Դ��ĳ���
            //������룺arr.fori���س�
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
        //ǰ��Ҫ�� 'import java.util.Arrays;'
        System.out.println(Arrays.toString(arr));
        //�����ʽ [1, 2, 3, 4, 5]
        System.out.println("============");
        //��ά����
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
                //println���Զ�����
                System.out.print(i+" ");
                //print�����Զ�����
            }
        }
        System.out.println("\n==========");
        System.out.println(Arrays.deepToString(arrn));
        //ע����deep,�����ʽ [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
