package 基础.Operator;

//小数参与计算时，有时候不精确
public class Demo2 {
    public static void main(String[] args) {
        //  除/
        System.out.println(10/2);//5
        System.out.println(10/3);//3
        System.out.println(10.0/3);//3.3333333333333335

        //  取模%(本质上也是除法运算，但结果时取的余数)
        System.out.println(10%2);//0
        System.out.println(10%3);//1

    }
}
