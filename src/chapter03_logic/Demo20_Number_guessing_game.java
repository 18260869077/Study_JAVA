package chapter03_logic;

import java.util.Scanner;

public class Demo20_Number_guessing_game {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100 + 1);
        System.out.println("请输入一个1-100的数字: ");
        int guess = new Scanner(System.in).nextInt();
        while (guess != number) {
            continue;
        }
        System.out.println("恭喜你，猜对了！");
    }
}
