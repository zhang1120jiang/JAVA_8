package cn.cuslink;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhangchundong
 * @Date:Create in 16:51 2018/8/7
 */

public class LambdaTest {
   public static void main(String[] args){

      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      // 直接打印
      System.out.println(list.spliterator().estimateSize());
      list.forEach(System.out::println);
      // 取值分别操作
      list.forEach(i -> { System.out.println(i * 3);});
       Runnable a = () -> System.out.println("测试接口");
       getTest gg = (c,d) -> c + d;
      System.out.println(gg.hh(1,2));
   }
}

interface getTest{
   int hh(int a,int b);
}
