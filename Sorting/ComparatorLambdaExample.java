package Lambda;

import java.util.*;

public class ComparatorLambdaExample {

    public static void main(String args[]) {

        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
  //      System.out.println(comparator1.compare(3, 2));

        Comparator<Integer> comparator2 = (a, b) -> b.compareTo(a);

  //      System.out.println(comparator2.compare(1, 1));

        List<Integer> list= Arrays.asList(34,5,45,556,43);
        Collections.sort(list,comparator2);
        for(Integer i:list){
            System.out.println(i);
        }

    }
}
