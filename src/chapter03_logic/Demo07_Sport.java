package chapter03_logic;

import java.util.Scanner;

public class Demo07_Sport  {
    public static void main(String[] args) {
        System.out.println("请输入星期数: ");
        int day = new Scanner(System.in).nextInt();
        switch (day) {
            case 1:
                System.out.println("周一: 跑步");
                break;
            case 2:
                System.out.println("周二: 游泳");
                break;
            case 3:
                System.out.println("周三: 打篮球");
                break;
            case 4:
                System.out.println("周四: 骑自行车");
                break;
            case 5:
                System.out.println("周五: 跳绳");
                break;
            case 6:
                System.out.println("周六: 打羽毛球");
                break;
            case 7:
                System.out.println("周日: 打乒乓球");
                break;
            default:
                System.out.println("输入的星期数有误");
        }
    }
}
