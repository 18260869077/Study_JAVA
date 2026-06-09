package chapter07_algorithm;

import java.util.Random;

public class Demo02_RedPacket {
    public static void main(String[] args) {
        int money = 10000;

        int n = 5;

        Random rand = new Random();

        for (int i = 0 ; i < n ; i++) {

            int myMoney = rand.nextInt(money - ( n - i) ) + 1  ;

            money = money - myMoney;

            System.out.println(money);
        }


    }
}
