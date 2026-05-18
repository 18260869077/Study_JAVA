package chapter03_logic;

import java.util.Scanner;

public class Demo03_recharge_bonus {
    public static void main(String[] args) {
        System.out.println("请输入充值金额: ");
        double amount = new Scanner(System.in).nextDouble();
        double bonus = 0;
        if (amount < 0) {
            System.out.println("充值金额不能为负数");
            return;
        }
        if (amount >= 0 && amount < 1000) {
            bonus = 0;
        }

        if (amount >= 1000) {
            bonus = 200;
        } else if (amount >= 2000) {
            bonus = 500 ;
        } else if (amount >= 3000) {
            bonus = 700;
        } else if (amount >= 5000) {
            bonus = 1300;
        } else if (amount >= 10000) {
            bonus = 2500;
        } else if (amount >= 20000) {
            bonus = 6000;
        } else if (amount >= 50000)  {
            bonus = 15000;
        }
        System.out.println("充值金额: " + amount + "元");
        System.out.println("充值赠送: " + bonus + "元");
        System.out.println("充值后余额: " + (amount + bonus) + "元");
        System.out.println("充值成功");
        System.out.println("欢迎下次光临");


    }
}
