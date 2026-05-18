package chapter03_logic;

import java.util.Scanner;

public class Demo13_sequence_sum {
    public static void main(String[] args) {
        System.out.println("请输入整数n：");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            if (i % 2 == 0){
                sum -= i;
            }else {
                sum += i;
            }
        }
        System.out.println("1到n的数列和为：" + sum);

    }
}
