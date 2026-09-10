package 基础.Operator;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 需求:键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
        Scanner sc =new Scanner(System.in);
        System.out.print("输入三位数：");
        int number=sc.nextInt();
        int hundred=number/100;
        number=number%(hundred*100);
        int ten=number/10;
        number=number%(ten*10);
        int ones=number%(ten*10);
        System.out.println("百位："+hundred+" "+"十位："+ten+" "+"个位"+ones);
    }
}
