package chapter07_algorithm;

import java.util.Random;
import java.util.Scanner;

public class Demo06_lottery {
    public static void main(String[] args) {

        int[] lotteryNumber = createlotteryNumber();
        printlotteryNumber(lotteryNumber);

        int[] mylotteryNumber = buylotteryNumber();
        printlotteryNumber(mylotteryNumber);

        getWinnerNumber(lotteryNumber, mylotteryNumber);




    }

    public static void getWinnerNumber(int[] arr1, int[] arr2) {
        int count1 = getCount(arr1,arr2,0,4);

        int count2 = getCount(arr1,arr2,5,6);

        if(count1 ==5 && count2 ==2) {
            System.out.println("恭喜你中了一等奖");
        }else if(count1 ==5 && count2 ==1) {
            System.out.println("恭喜你中了二等奖");
        }else if(count1 ==5 && count2 ==0 || count1 ==4 && count2 ==2) {
            System.out.println("恭喜你中了三等奖");
        }else if(count1 ==4 && count2 ==1 || count1 ==3 && count2 ==2) {
            System.out.println("恭喜你中了四等奖");
        }else if(count1 ==4 && count2 ==0 || count1 ==3 && count2 ==1) {
            System.out.println("恭喜你中了五等奖");
        }else if(count1 ==3 && count2 ==0 || count1 ==2 && count2 ==1) {
            System.out.println("恭喜你中了六等奖");
        }else {
            System.out.println("恭喜你没有中奖");
        }



    }

    public static int getCount(int[] arr1, int[] arr2,int start,int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            boolean flag = contains(arr1,arr2[i],start,end);
            if (flag) {
                count++;
            }
        }

        return count;


    }

    public static int[] buylotteryNumber() {
        int[]arr = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; ) {
            System.out.println("请输入第 " + (i + 1) + "个彩票号码");
            int num = sc.nextInt();

            if (num < 1 || num > 35) {
                System.out.println("当前彩票号码不在范围中，请重新输入~！");
                continue;

            }

            boolean flag = contains(arr,num,0,4);
            if (flag) {
                System.out.println("当前彩票号码已经存在，请重新输入~！");
                continue;

            }

            arr[i] = num;
            i++;

        }

        for (int i = 0; i < 2; ) {
            System.out.println("请输入第 " + (i + 1) + "个彩票号码");
            int num = sc.nextInt();

            if (num < 1 || num > 12) {
                System.out.println("当前彩票号码不在范围中，请重新输入~！");
                continue;

            }

            boolean flag = contains(arr,num,5,6);
            if (flag) {
                System.out.println("当前彩票号码已经存在，请重新输入~！");
                continue;

            }

            arr[i + 5] = num;
            i++;
        }
        return arr;
    }

    public static int[] createlotteryNumber() {
        int[]arr = new int[7];
        Random random1 = new Random();

        for (int i = 0; i < 5;) {

            int number = random1.nextInt(1,36);

            boolean flag = contains(arr, number,0,4);

            if (!flag) {
                arr[i] = number;
                i++;
            }

        }

        for (int i = 0; i < 2;) {

            int number = random1.nextInt(1,13);

            boolean flag = contains(arr, number,5,6);

            if (!flag) {
                arr[i + 5 ] = number;
                i++;
            }

        }



        return arr;
    }

    public static boolean contains(int[] arr, int number,int start,int end ) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void printlotteryNumber(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }

        }

        System.out.println("]");
    }
}
