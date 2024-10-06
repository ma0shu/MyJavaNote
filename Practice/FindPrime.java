package Practice;
//传统c写法：用flag结束外层循环
public class FindPrime {
    public static void main(String[] args) {
        System.out.println("素数个数："+Search(2,100));
    }
    public static int Search(int start, int end){
        int cnt=0;
        for(int i=start; i<=end;i++){
            Boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if(!isPrime)
                continue;
            System.out.println(i);
            cnt++;
        }
        return cnt;
    }
}
//JAVA新写法，从内层直接结束外层循环，更方便
class FindPrime2 {
    public static void main(String[] args) {
        System.out.println("素数个数："+Search(2,100));
    }
    public static int Search(int start, int end){
        int cnt=0;
        OUT://注意这里，做一个标签，叫什么都行
        for(int i=start; i<=end;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    continue OUT;//用标签
            }
            System.out.println(i);
            cnt++;
        }
        return cnt;
    }
}
//把内层循环拆分成函数
class FindPrime3 {
    public static void main(String[] args) {
        System.out.println("素数个数："+Search(2,100));
    }
    public static int Search(int start, int end){
        int cnt=0;
        for(int i=start; i<=end;i++){
            if(!Check(i)) {
                continue;
            }
            System.out.println(i);
            cnt++;
        }
        return cnt;
    }
    public static Boolean Check(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}