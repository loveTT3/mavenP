package test1.t03_类;


import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Test01_String {

    private String ss;

    public static void main(String[] args) {
//        compareTo_test();
    }


    /**
     * compareTo方法:
     * 1.字符串与对象进行比较。
     * 2.按字典顺序比较两个字符串。
     */
    @Test
    public void compareTo_test() {
        String s1 = "123";
        String s2 = "123tt";
        System.out.println(s1.compareTo(s2));

        String l1 = "22222222";
        String l2 = "21111111";
        System.out.println(l1.compareTo(l2));
    }

    @Test
    public void test_list() {
        List list1 = new ArrayList();
        System.out.println(CollectionUtils.isEmpty(list1));
    }

    @Test
    public void test_string() {
        String s1 = "";
        String s2 = "11";
        System.out.println(StringUtils.isNotBlank(s1));
        System.out.println(StringUtils.isNotBlank(s2));
    }
}
