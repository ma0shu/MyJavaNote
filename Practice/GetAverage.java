package Practice;
//练一练数组和Scanner,没什么新鲜的
import java.util.Scanner;
public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] scores=new int[N];
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            scores[i]=scanner.nextInt();
            sum=sum+scores[i];
        }
        System.out.println((double)sum/(double)N);

    }
}
