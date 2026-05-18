package chapter03_logic;

import java.util.Scanner;

public class Demo14_Compound_Interest {
    public static void main(String[] args) {
        System.out.println("请输入本金: ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double target = 2 * principal;
        System.out.println("请输入年利率: ");
        double rate = scanner.nextDouble();
        int year = 0;
        while (principal <= target) {
            principal = principal * (1 + rate);
            year++;
        }
        System.out.println("本金翻倍的年数: " + year);
    }
}
