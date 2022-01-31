package test1.t07高级编程;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素。
 * ArrayList 继承了 AbstractList ，并实现了 List 接口。
 * ArrayList 类位于 java.util 包中
 */
public class t01_ArrayList {

    @Test
    public void Array_t01() {
        List<String> list1 = new ArrayList<String>();

        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("444");// 添加
        System.out.println(list1.get(0));   // 访问 通过索引
        list1.set(0,"222"); // 修改
        System.out.println(list1.get(0));   // 访问 通过索引
        list1.remove(0);  // 删除
        System.out.println(list1.size());   // 查看列表大小
        // 遍历
        for (String i : list1){
            System.out.print(i);
            System.out.println();
        }

        list1.addAll(list1);
        System.out.println(list1);
    }


}
