package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String [] args){
        List<Integer> list= Arrays.asList(1,4,7,4,9,0,9);
        Set<Integer> s= new HashSet<>();
        list.stream().filter(a->!s.add(a)).forEach(System.out::println);
   //     list.stream().findFirst().ifPresent(System.out::println);
        int max=list.stream().max(Integer::compare).get();
        System.out.print("max"+max);
    }
}
