package chapter03_logic;

public class Demo21_ {
    public static void main(String[] args) {
//        for (int i = 1;i <= 4;i++) {
//            System.out.println("");
//            for(int j = 1;j <=5;j++) {
//                System.out.print("*");
//
//            }
//        }

//        for (int i = 1;i <= 5;i++) {
//            System.out.println("");
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//        }

//        for (int i = 5;i >= 1;i--) {
//            System.out.println("");
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//        }

//        for(int i = 1;i <=3 ;i++) { //打印
//
//            for ( int j = 1; j <= 3 - i; j++) {
//                System.out.print(" ");
//            }
//
//            for ( int k = 1; k <= 6; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println("");
//        }

//        for (int i = 1; i <= 3; i++) {
//
//            for (int j = 1; j <= 3 - i ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i + 1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println("");
//
//        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println("");

        }




    }
}
