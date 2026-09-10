package 基础.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //需求:键盘录入两个整数，求出他们的和并打印出来。
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int number1 =sc.nextInt();
        System.out.print("请输入第二个数：");
        int number2=sc.nextInt();
        System.out.println("两个数的和是："+(number1+number2));
    }
}
