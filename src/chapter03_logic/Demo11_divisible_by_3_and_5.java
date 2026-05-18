package chapter03_logic;
import java.util.Scanner;
public class Demo11_divisible_by_3_and_5 {
    public static void main(String[] args) {
        System.out.println("请输入开始的整数：");
        int start = new Scanner(System.in).nextInt();
        System.out.println("请输入结束的整数：");
        int end = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = start ; i <= end ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum ++;
            }
        }

        System.out.println("在" + start + "到" + end + "之间共有" + sum + "个数是3的倍数且5的倍数");

    }
}
