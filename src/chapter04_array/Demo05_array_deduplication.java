package chapter04_array;

public class Demo05_array_deduplication {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};

        int slow = 0;
        int fast = 1;

        while (fast < arr.length) {
            if (arr[slow] == arr[fast]) {
                fast++;

            }else {
                slow++;
                arr[slow] = arr[fast];
                fast++;

            }
        }



        for (int k = 0;k <= slow;k++) {
            System.out.print(arr[k] + " ");
        }
    }

}