package chapter07_algorithm;

public class Demo05_Trapping_Rain_Water {
    public static void main(String[] args) {
        int[]arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                leftMax[i] = temp;
            }else {
                leftMax[i] = arr[i];
                temp = arr[i];
            }
        }

        temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (temp > arr[i]) {
                rightMax[i] = temp;
            }else  {
                rightMax[i] = arr[i];
                temp = arr[i];
            }
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < rightMax.length; i++) {
            if(leftMax[i] < rightMax[i]){
                result[i] = leftMax[i];
            }else  {
                result[i] = rightMax[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        System.out.println(sum);

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        System.out.println(sum);

    }
}




