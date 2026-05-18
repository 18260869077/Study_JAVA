package chapter02_syntax;

import java.util.Scanner;

public class Demo03_Sum {
    public static void main(String[] args) {
//        键盘输入并求和
        System.out.println("请输入第一个数字：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("两个数字的和为：" + (num1 + num2));
//        定义两个整数类型的变量num1和num2，键盘录入数据分别为两个变量赋值。
//        求两个数的和并进行打印。
    }
}
