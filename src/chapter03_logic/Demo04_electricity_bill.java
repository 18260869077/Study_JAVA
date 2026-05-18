package chapter03_logic;

import java.util.Scanner;

public class Demo04_electricity_bill {
    public static void main(String[] args) {
        System.out.println("请输入使用电量: ");
        double usage = new Scanner(System.in).nextDouble();
        if (usage < 0) {
            System.out.println("输入的电量有误");
            return;
        }
        double cost = 0;
        if (usage >= 0 && usage <= 100) {
            cost = usage * 0.5;
        } else if (usage > 100 && usage <= 200) {
            cost = 100 * 0.5 + (usage - 100) * 0.8;
        } else if (usage > 300) {
            cost = 100 * 0.5 + 100 * 0.8 + (usage -200) * 1.2;
        }
        System.out.println("电费为: " + cost);

    }
}
