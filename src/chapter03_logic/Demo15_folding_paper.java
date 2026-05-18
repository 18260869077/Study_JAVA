package chapter03_logic;

import java.util.Scanner;

public class Demo15_folding_paper {
    public static void main(String[] args) {
        System.out.println("请输入纸张的厚度(单位:毫米): ");
        Scanner scanner = new Scanner(System.in);
        double thickness = scanner.nextDouble();
        System.out.println("请输入山峰的高度(单位:米): ");
        double height = scanner.nextDouble() * 1000; // 转换为毫米
        int count = 0;
        while (thickness < height) {
            thickness *= 2; // 每次对折厚度翻倍
            count++;
        }
        System.out.println("需要对折的次数: " + count);
    }
}
