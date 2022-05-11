package Study_SE.t01数据类型运算符;

import java.util.Scanner;

public class test_06_sanmu {
    /**
     * a?b:c
     * 其中a是一个布尔类型的表达式，返回结果要么是true要么false，通过a的结果决定最终表达式的结果:
     * 如果a的结果是true，那么表达式最终结果为b
     * 如果a的结果是false，那么表达式最终结果为c
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = (5 > 7) ? 6 : 9;
        System.out.println(num);
        String str = (4 == 4) ? "你好" : "你不好";
        System.out.println(str);
        System.out.println((4 == 4) ? "你好" : "你不好");

        p1();
    }

    public static void p1() {
        //实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的

        //1.要让男孩女孩选择晚饭吃什么：
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择今晚吃什么：1.火锅 2.烧烤 3.麻辣烫 4.西餐");
        System.out.println("请男孩选择：");
        int boyChoice = sc.nextInt();
        System.out.println("请女孩选择：");
        int girlChoice = sc.nextInt();
        //2.判断：
        System.out.println(boyChoice == girlChoice ? "听男孩的" : "听女孩的");
    }


}
