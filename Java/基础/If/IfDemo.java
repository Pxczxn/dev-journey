package 基础.If;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //需求:键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应
        Scanner sc = new Scanner(System.in);
        System.out.print("女婿的酒量：");
        int wine = sc.nextInt();
        if (wine>2){
            System.out.println("老丈人：小伙子不错哦！");
        }
    }
}
