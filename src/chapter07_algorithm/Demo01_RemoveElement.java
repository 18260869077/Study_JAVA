package chapter07_algorithm;

public class Demo01_RemoveElement {
    public static void main(String[] args) {



        int[] nums = {3,2,2,3};

        int val = 3;

        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] == val) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                slow++;
                fast++;

            }
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
