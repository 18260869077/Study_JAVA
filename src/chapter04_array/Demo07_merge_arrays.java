package chapter04_array;

public class Demo07_merge_arrays {
    public static void main(String[] args) {
        //定义两个数组，并且已经有序
        int [] arr1 = {1,3,5,7,9};
        int [] arr2 = {2,4,6,8,10};
        //定义一个新数组，长度是前两个数组长度之和
        int [] arr3 = new int[arr1.length + arr2.length];
        //定义三个变量，分别表示三个数组的索引
        int i = 0;
        int j = 0;
        int k = 0;
        //当两个数组的索引都小于数组长度时，进行比较
        while(i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;

            } else {
                arr3[k] = arr2[j];
                j++;

            }
            k++;
        }
        while(i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }


        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
