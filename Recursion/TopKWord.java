package String;

import java.util.*;

public class TopKWord {

    public static void main(String [] args){
        String[] words={"i","love","leetcode","i","love","coding"};
        int k=2;
        List<String> result=topKFrequent(words, k);
        for(String s:result){
            System.out.print(s);
        }

    }

    private static List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<words.length;i++){
            map.put(words[i], map.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            pq.add(entry);

        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            Map.Entry<String,Integer> e=pq.remove();
            result.add(e.getKey());
        }

        return result;
    }
}
