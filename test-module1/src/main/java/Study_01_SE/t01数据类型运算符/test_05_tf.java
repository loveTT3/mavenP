package Study_SE.t01数据类型运算符;

public class test_05_tf {
    public static void main(String[] args) {
        // 逻辑与 ：& 规律：只要有一个操作数是false，那么结果一定是false
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);

        // 短路与：&& 规律：效率高一些，只要第一个表达式是false，那么第二个表达式就不用计算了，结果一定是false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        // 逻辑或：| 规律：只要有一个操作数是true，那么结果一定是true
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);

        // 短路或：|| 规律：效率高一些，只要第一个表达式是true，那么第二个表达式就不用计算了，结果一定是true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        //逻辑非：   !  规律：相反结果
        System.out.println(!true);//false
        System.out.println(!false);//true

        //逻辑异或： ^  规律：两个操作数相同，结果为false，不相同，结果为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);

    }
}
