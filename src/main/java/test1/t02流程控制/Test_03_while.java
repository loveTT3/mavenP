package test1.t02流程控制;

public class Test_03_while {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        //功能：1+2+3+4+5
        //1.定义变量：
        int num = 1;
        //2.定义一个求和变量，用来接收和：
        int sum = 0;
        while (num <= 5) {
            sum += num;
            num++;
        }
        //3.输出和
        System.out.println(sum);
    }
}
