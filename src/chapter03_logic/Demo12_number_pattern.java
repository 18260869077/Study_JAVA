package chapter03_logic;

public class Demo12_number_pattern {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 1;
        int sum = 0;
        for (int i = 3; i <= 11; i++) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
            System.out.print(sum + " ");

        }
    }
}
