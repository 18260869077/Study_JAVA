package chapter03_logic;
import java.util.Scanner;
public class Demo16_digit_sum {
    public static void main(String[] args) {
        System.out.println("请输入一个整数: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n < 0) {
            n = -n;  // 或者 n = Math.abs(n);
        }

        while (n > 0){
            sum += n % 10;  // 获取最后一位数字并累加到 sum 中
            n /= 10;
        }

        System.out.println("数字的各位数字之和为: " + sum);

    }
}
