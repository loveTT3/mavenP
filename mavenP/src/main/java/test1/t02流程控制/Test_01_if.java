package test1.t02流程控制;

public class Test_01_if {
    public static void main(String[] args) {
        int a = 10,b = 20;
        if (a>b){
            System.out.println(a);
            System.out.println(b);
        }else if (a==b){
            System.out.println(a+b);
        }else {
            System.out.println("dad");
        }
    }
}

