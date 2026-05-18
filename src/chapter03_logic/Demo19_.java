package chapter03_logic;

import java.util.Scanner;

public class Demo19_ {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                continue;
            } else if (i / 10 == 4) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
