package Practice;

public class test1 {
    static void quote(int a[],int b[]){
        b=a;
// (1)       b[1]=10;
    }
    static void nonquote(int r[],int b[]){
        for(int i=0;i<r.length;i++)
        {
            b[i]=r[i];
        }
    }
    public static void main(String args[]){
        int r[]={1,2,3,4,5},b[]=new int[r.length];
        quote(r,b);
//(2)        b[1]=10;
        System.out.println(r[1]+"It changed!");
    }
}
