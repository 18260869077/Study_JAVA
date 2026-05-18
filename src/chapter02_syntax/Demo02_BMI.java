package chapter02_syntax;

import java.util.Scanner;

public class Demo02_BMI {
/**
 * BMI身体质量指数计算器
 *
 * BMI计算公式: BMI = 体重 / 身高²
 * - 体重单位: 千克(kg)
 * - 身高单位: 米(m)
 *
 * BMI数值与健康状态对照表:
 * ┌─────────────┬──────────┬──────────┐
 * │  BMI数值     │ 身体状态  │ 健康风险  │
 * ├─────────────┼──────────┼──────────┤
 * │  < 18.5     │ 消瘦     │ 部分增加  │
 * │  18.5-23.9  │ 正常     │ 正常     │
 * │  24.0-26.9  │ 偏胖     │ 增加     │
 * │  27.0-29.9  │ 肥胖     │ 中度增加  │
 * │  ≥ 30.0     │ 严重肥胖  │ 严重增加  │
 * └─────────────┴──────────┴──────────┘
 */
public static void main(String[] args) {
    // 创建Scanner对象用于接收用户输入
    Scanner scanner = new Scanner(System.in);
// 提示用户输入体重(千克)
    System.out.println("请输入体重(千克): ");
    double weight = scanner.nextDouble();
// 提示用户输入身高(米)
    System.out.println("请输入身高(米): ");
    double height = scanner.nextDouble();
// 计算BMI指数: BMI = 体重 / (身高 × 身高)
    double BMI = weight / (height * height);
// 输出计算结果,保留两位小数
    System.out.println("您的BMI指数为： "+ BMI);
// 根据BMI值判断身体状态和健康风险
    String bodyState = "";
    String healthRisk = "";
// BMI小于18.5: 消瘦,健康风险部分增加

// BMI在18.5-23.9之间: 正常,健康风险正常

// BMI在24.0-26.9之间: 偏胖,健康风险增加

// BMI在27.0-29.9之间: 肥胖,健康风险中度增加

// BMI大于等于30.0: 严重肥胖,健康风险严重增加
    if (BMI < 18.5) {
        System.out.println("您是瘦子,健康风险部分增加");
        bodyState = "瘦子";
        healthRisk = "部分增加";
    }else if (BMI >= 18.5 && BMI <= 23.9){
        System.out.println("您是正常人,健康风险正常");
        bodyState = "正常";
        healthRisk = "正常";
    }else if (BMI >23.9 && BMI <= 26.9){
        System.out.println("您是偏瘦人,健康风险增加");
        bodyState = "偏瘦";
        healthRisk = "增加";
    }else if (BMI > 26.9 && BMI <= 29.9) {
        System.out.println("您是偏胖人,健康风险中度增加");
        bodyState = "偏胖";
        healthRisk = "中度增加";
    }else if (BMI > 29.9) {
        System.out.println("您是肥胖人,健康风险严重增加");
        bodyState = "肥胖";
        healthRisk = "严重增加";
    }


// 输出评估结果
    System.out.println("您的身体状态为：" + bodyState + ",健康风险为：" + healthRisk);
// 关闭Scanner资源
    scanner.close();
}


}
