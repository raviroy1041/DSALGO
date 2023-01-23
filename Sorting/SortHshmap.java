package Lambda;

import java.util.*;

public class SortHshmap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = Arrays.asList("ravi", "ram", "ravi", "ravi", "aman","aman","ram");
        for (String i : list) {

                map.put(i, map.getOrDefault(i,0)+1);
        }

    //    HashMap<String, Integer> map1 = sortByValue(map);

       //Sort in lexographical order if values same
        List<Map.Entry<String, Integer>> arraylist = new ArrayList<>(map.entrySet());
    //    Collections.sort(arraylist,(i1,i2)->(i2.getValue().compareTo(i1.getValue())==0)?i1.getKey().compareTo(i2.getKey()):i2.getValue().compareTo(i1.getValue()));
        Collections.sort(arraylist,(o1,o2)->o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<String, Integer> entry : arraylist) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());


        }



    }

    /*public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> arraylist = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        Collections.sort(arraylist, comp);

        HashMap<String,Integer> temp=new HashMap<>();
        for(Map.Entry<String,Integer> e:arraylist){
            temp.put(e.getKey(),e.getValue());

    }
        return temp;

}*/
}
