package Practice;
//��ͳcд������flag�������ѭ��
public class FindPrime {
    public static void main(String[] args) {
        System.out.println("����������"+Search(2,100));
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
//JAVA��д�������ڲ�ֱ�ӽ������ѭ����������
class FindPrime2 {
    public static void main(String[] args) {
        System.out.println("����������"+Search(2,100));
    }
    public static int Search(int start, int end){
        int cnt=0;
        OUT://ע�������һ����ǩ����ʲô����
        for(int i=start; i<=end;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    continue OUT;//�ñ�ǩ
            }
            System.out.println(i);
            cnt++;
        }
        return cnt;
    }
}
//���ڲ�ѭ����ֳɺ���
class FindPrime3 {
    public static void main(String[] args) {
        System.out.println("����������"+Search(2,100));
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