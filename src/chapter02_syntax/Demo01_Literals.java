package chapter02_syntax;

/**
 * 第2章-语法篇 练习
 * 内容：字面量、变量、数据类型、标识符、键盘录入、运算符、类型转换
 */
public class Demo01_Literals {
    public static void main(String[] args) {
        // TODO: 第2章练习代码
//        我方:叉子
//        攻击:220
//        防御:85
//        血量:1012.5
//        技能加成:1.2

//        对方:长手
//        攻击:210
//        防御:80
//        血量:1223.3
//        技能加成:1.3
//        技能造成伤害的公式:攻击力*技能加成-对方防御力
//        普攻造成伤害的公式:攻击力-对方防御力
//        计算:
//        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
//        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?
        //我方属性
        int myAttack = 220;
        int myDefence = 85;
        double mySkillRatio = 1.2;

        //对方属性
        double ememyHp = 1223.3;
        int ememyAttack = 210;
        int ememyDefence = 80;
        double ememySkillRatio = 1.3;

        //第一次普攻
        double damage1 = myAttack - ememyDefence;
        ememyHp = ememyHp - damage1;
        System.out.println("我方普攻造成伤害：" + damage1);
        System.out.println("对方剩余血量：" + ememyHp);

        //第二次技能攻击
        double damage2 = myAttack * mySkillRatio;
        ememyHp = ememyHp - damage2;
        System.out.println("我方技能造成伤害：" + damage2);
        System.out.println("对方剩余血量：" + ememyHp);




    }
}
