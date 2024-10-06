package Practice;
import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] userNumbers=UserSelectNumbers();
        System.out.print("Your Numbers:");
        PrintArray(userNumbers);

        int[] luckyNumbers=CreateLuckyNumbers();
        System.out.print("Lucky Numbers:");
        PrintArray(luckyNumbers);
        judge(userNumbers,luckyNumbers);
    }
    public static void PrintArray(int[] Array){
        System.out.print("[");
       for(int i=0;i<Array.length;i++)
           System.out.print((i==Array.length-1)?Array[i]:(Array[i]+","));
       System.out.println("]");
    }
    public static int[] UserSelectNumbers(){
        int[] numbers=new int[7];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<numbers.length-1;i++)
        {
            System.out.println("Input your Red Ball number "+(i+1)+":");
            int number=scanner.nextInt();
            if(number<1||number>33){
                System.out.println("非法输入");
                i--;
                continue;
            }
            if(exist(number,numbers)){
                System.out.println("重复输入");
                i--;
                continue;
            }
            numbers[i]=number;
        }
        while(true) {
            System.out.println("Input your Blue Ball number:");
            int number=scanner.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("非法输入");
            }
            else {
                numbers[6]=number;
                break;
            }
        }
        return numbers;
    }
    public static int[] CreateLuckyNumbers(){
        int[] numbers=new int[7];
        Random random=new Random();
        for (int i=0;i<numbers.length-1;i++) {
            int number=random.nextInt(33)+1;
            if(exist(number,numbers)){
                i--;
                continue;
            }
            numbers[i]=number;
        }
        numbers[6]=random.nextInt(16)+1;
        return numbers;
    }
    public static Boolean exist(int number,int[] numbers){
        for(int num:numbers){
            if(num==number){
                return true;
            }
        }
        return false;
    }
    public static void judge(int[] userNumbers,int[] luckyNumbers){
        int redCnt=0;
        int blueCnt=0;
        for(int i=0;i<6;i++){
            if(exist(i,luckyNumbers)){
                redCnt++;
            }
        }
        if(userNumbers[6]==luckyNumbers[6]){
            blueCnt++;
        }
        System.out.println("Red Ball:"+redCnt+" ,Blue Ball:"+blueCnt);
        System.out.println("Total Reward:"+Math.pow(10,redCnt)*Math.pow(20,blueCnt)+" Yuan");
    }
}
