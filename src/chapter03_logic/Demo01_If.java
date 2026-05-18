package chapter03_logic;

import java.util.Scanner;

/**
 * 第3章-判断-选择-循环 练习
 * 内容：if语句、switch语句、for循环、while循环、do...while循环、break、continue
 */
public class Demo01_If {
    public static void main(String[] args) {
        // TODO: 第3章练习代码
        /*
         * 需求: 游戏人物血量计算
         * - 初始最大生命值: 200
         * - 受到X点伤害(由键盘录入)
         * - 技能恢复Y点血(由键盘录入)
         * - 游戏规则: 人物不会死亡,最少保留1点血
         * - 问题: 计算最终游戏人物的血量是多少?
         */
        int maxHp = 200;
        System.out.println("请输入受到的伤害: ");
        int damage = new Scanner(System.in).nextInt();
        System.out.println("请输入技能恢复的血量: ");
        int recover = new Scanner(System.in).nextInt();
        int hp = maxHp - damage + recover;
        if (hp <= 0) {
            hp = 1;
        }else if (hp > maxHp) {
            hp = maxHp;
        }else {
            hp = hp;
        }
        System.out.println("最终游戏人物的血量为: " + hp);
    }
}
