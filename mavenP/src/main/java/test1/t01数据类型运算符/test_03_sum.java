package test1.t01数据类型运算符;

import java.util.Scanner;

public class test_03_sum {
    public static void main(String[] args) {
        //打印结果：
        System.out.println(12 / 3);
        System.out.println(12 % 5);
        System.out.println(12 / 3.0);  // 4.0
        System.out.println(12 % 5.0);  // 2.0

        p1();
    }

    public static void p1() {
        //实现功能：任意给出一个四位数，求出每位上的数字并输出
        //1.任意给出一个四位数：
        Scanner input = new Scanner(System.in);
        System.out.println("请录入一个四位数：");
        int num = input.nextInt();
        //2.求出每位上的数字：
        //个位数：
        int num1 = num % 10;
        //十位数：
        int num2 = num / 10 % 10;//1234--->123--->3
        //百位数：
        int num3 = num / 100 % 10;//1234--->12--->2
        //千位数：
        int num4 = num / 1000;//1234--->1
        //3.输出每位上的数字：
        System.out.println("个位上的数为：" + num1);
        System.out.println("十位上的数为：" + num2);
        System.out.println("百位上的数为：" + num3);
        System.out.println("千位上的数为：" + num4);
    }

    public static void p2() {
        int a = 5;
        a++;//理解为：相当于  a=a+1 操作
        System.out.println(a);//6

        a = 5;
        ++a;//理解为：相当于  a=a+1 操作
        System.out.println(a); //6

        //总结：++单独使用的时候，无论放在前还是后，都是加1操作

        //将++参与到运算中：
        //规则：看++在前还是在后，如果++在后：先运算，后加1   如果++在前，先加1，后运算
        a = 5;
        int m = a++ + 7;//先运算  m=a+7  再加1：  a = a+1
        System.out.println(m);//12
        System.out.println(a);//6

        a = 5;
        int n = ++a + 7;//先加1  a=a+1  再运算：  n = a+7
        System.out.println(n);//13
        System.out.println(a);//6
    }

    public static void p3() {
        int a = 5;
        System.out.println(a++ + a++);
        System.out.println(a++ + ++a);
        System.out.println(++a + a++);
        System.out.println(++a + ++a);
    }

}

