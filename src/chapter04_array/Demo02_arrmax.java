package chapter04_array;

public class Demo02_arrmax {
    public static void main(String[] args) {
        int [] arr = {33,5,22,44,55,33};
        int max = arr[0];
        for (int i = 1;i < arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组最大值为：" + max);
    }
}
