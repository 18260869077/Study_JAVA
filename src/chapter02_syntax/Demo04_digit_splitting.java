package chapter02_syntax;

public class Demo04_digit_splitting {
    public static void main(String [] args) {
        int num = 123;
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        System.out.println(a + " " + b + " " + c);
    }
}
