package chapter03_logic;

import java.util.Scanner;

public class Demo05_is_triangle {
    public static void main(String[] args) {
        System.out.println("请输入三角形的三边: ");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("等边三角形");
            } else if (a == b || b ==c || a == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("普通三角形");
            }

        } else {
            System.out.println("不能构成三角形");
        }


    }
}
