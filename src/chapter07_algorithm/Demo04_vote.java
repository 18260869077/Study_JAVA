package chapter07_algorithm;

import java.util.Random;

public class Demo04_vote {
    public static void main(String[] args) {


        int [] arr = new int [6];

        Random rand = new Random();
        for (int i = 0;i < 1000;i++) {
            int vote = rand.nextInt(0,6);
            arr[vote]++;
        }


        for (int i = 0;i < arr.length;i++) {
            System.out.println("第" + i + "个候选人的得票是：" + arr[i] + " 得票率是：" + arr[i] * 1.0 / 1000 * 100 + "%" );
        }

        int max = arr[1];

        for (int j = 2;j < arr.length;j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }


        for (int j = 1;j < arr.length;j++) {
            if (arr[j] == max) {
                System.out.println("第" + j + "个候选人的票数最多:" + max );

            }
        }






        System.out.println("弃票数：" + arr[0] + "弃票率：" + arr[0] * 1.0 / 1000 * 100 + "%");





    }
}
