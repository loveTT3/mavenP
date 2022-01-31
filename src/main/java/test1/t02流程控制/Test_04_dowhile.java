package test1.t02流程控制;

public class Test_04_dowhile {
    public static void main(String[] args) {
        int i = 101;
        int sum = 0;
        do{
            sum += i;
            i++;
        }while(i<=100);//一定要注意写这个分号，否则编译出错
        System.out.println(i);//102
        System.out.println(sum);//101
    }
}
