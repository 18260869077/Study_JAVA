package chapter04_array;

import java.util.Scanner;

public class Demo01_findnum {
    public static void main(String[] args) {
        int [] arr = {33,5,22,44,55,33};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int findNum = scanner.nextInt();
        boolean flag = false;
        for (int i = 0;i <= arr.length;i++){
            if (arr[i] == findNum) {
                System.out.println("找到数字：" + findNum + "，索引为：" + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("没有找到数字：" + findNum);
        }
    }
}
