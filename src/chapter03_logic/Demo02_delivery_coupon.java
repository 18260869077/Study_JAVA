package chapter03_logic;

import java.util.Scanner;

public class Demo02_delivery_coupon {
    public static void main(String[] args) {
//        外卖优惠卷
//        需求:小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
//        已知:
//        饱了么App:全场9折优惠
//        美单App:满30减10元
//        请问1:
//        小明买了一吨烧烤50元，在哪家下单更划算
//        请问2:
//        如果价格不确定，数据由键盘录入而来呢?
        System.out.println("请输入价格: ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        double price1 = price * 0.9; // 饱了么9折优惠
        double price2 = 0;
        if (price >= 30) {
             price2 = price - 10;
        }else {
             price2 = price;
        }
        if (price1 < price2) {
            System.out.println("在饱了么App下单更划算");
        }else {
            System.out.println("在美单App下单更划算");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入价格: ");
//        price = scanner.nextDouble();


    }
}
