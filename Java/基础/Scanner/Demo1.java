package 基础.Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("输入数字：");
        int i =sc.nextInt();
        System.out.println("你输入的数字是："+i);
    }
}
