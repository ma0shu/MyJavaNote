package Notes;

import java.util.Scanner;
//������scanf
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //��ʼ��scanner
        System.out.println("input your name:");
        String name = scanner.nextLine();//Line:һ��

        System.out.println("input your age:");
        int age = scanner.nextInt();//Int:����

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
