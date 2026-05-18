package chapter03_logic;

import java.util.Scanner;

public class Demo17_prime_number {
    public static void main(String[] args) {
        System.out.println("请输入数字: ");
        int n = new Scanner(System.in).nextInt();

        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
}
