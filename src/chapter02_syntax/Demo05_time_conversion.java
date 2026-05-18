package chapter02_syntax;

public class Demo05_time_conversion {
    public static void main(String[] args) {
        int time = 3661;
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
