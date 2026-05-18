package chapter04_array;
import java.util.Random;
public class Demo04_deduplicate {
    public static void main(String[] args) {
        // 1.创建一个长度为10的数组
        int [] arr = new int[10];
        Random rand = new Random();


        // 2.使用循环给数组赋值，要求随机生成1-100之间的数
        for (int i = 0;i < 10;i++) {
            if (i == 0) {
                arr[0] = rand.nextInt(100) + 1;
            } else {
                int temp = rand.nextInt(100) + 1;
                boolean flag = true;
                for (int j = 0;j < i;j++) {
                    if (temp == arr[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    arr[i] = temp;
                } else {
                    i--;
                }
            }

        }

        for (int i = 0;i < 10;i++) {
             System.out.print(arr[i] + " ");
        }

    }
}
