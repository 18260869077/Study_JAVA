package chapter03_logic;

import java.util.Scanner;

public class Demo06_x_y {
    public static void main(String[] args) {
        System.out.println("请输入x的值：");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("请输入y的值：");
        double y = new Scanner(System.in).nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("点x,y在原点");
        } else if (x > 0 && y > 0) {
            System.out.println("点x,y在第一象限");
        } else if (x < 0 && y > 0) {
            System.out.println("点x,y在第二象限");
        } else if (x < 0 && y < 0) {
            System.out.println("点x,y在第三象限");
        } else if (x > 0 && y < 0) {
            System.out.println("点x,y在第四象限");
        } else if (x == 0 && y != 0) {
            System.out.println("点x,y在y轴上");
        } else if (x != 0 && y == 0) {
            System.out.println("点x,y在x轴上");
        }
    }
}