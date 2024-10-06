package Notes;

import java.util.Scanner;
//类似于scanf
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //初始化scanner
        System.out.println("input your name:");
        String name = scanner.nextLine();//Line:一行

        System.out.println("input your age:");
        int age = scanner.nextInt();//Int:整数

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
