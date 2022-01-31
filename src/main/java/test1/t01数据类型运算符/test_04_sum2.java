package test1.t01数据类型运算符;

public class test_04_sum2 {
    public static void main(String[] args) {
        //实现功能：给出三个数，求和：
        //1.给出三个数：
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //2.求和
        //int sum = num1+num2+num3;
        //定义一个变量，用来接收和：
        int sum = 0;
        sum = sum + num1;//等效：  sum += num1;
        sum = sum + num2;// sum += num2;
        sum = sum + num3;//sum += num3;
        //3.将和输出：
        System.out.println("和：" + sum);
    }

    /**
     * a+=b  和  a=a+b  区别：
     * a+=b    可读性稍差 编译效率高   底层自动进行类型转换
     * a=a+b     可读性好  编译效率低   手动进行类型转换
     */


}
