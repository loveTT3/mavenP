package test1.t02流程控制;

public class Test_02_switch {
    public static void main(String[] args) {
        switchtest();
    }

    public static void switchtest() {
        /*
                实现一个功能：
                根据给出的学生分数，判断学生的等级：
                >=90  -----A
                >=80  -----B
                >=70  -----C
                >=60  -----D
                <60   -----E
                }
                */
        //1.给出学生的成绩：
        int score = 37;
        //2.根据成绩判断学生的等级：
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A级");
                break;
            case 8:
                System.out.println("B级");
                break;
            case 7:
                System.out.println("C级");
                break;
            case 6:
                System.out.println("D级");
                break;
            default:
                System.out.println("成绩错误");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("E级");
                break;
        }
    }
}
