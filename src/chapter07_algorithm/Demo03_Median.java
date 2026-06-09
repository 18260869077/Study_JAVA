package chapter07_algorithm;

public class Demo03_Median {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 =  new int [] {1,2,3,4,5,6};

        int [] arr3 = new int [arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }





        for (k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }


    }
}



