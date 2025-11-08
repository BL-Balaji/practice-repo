package string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        String str = "java is java and java is fun";
        String[] words = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String word : words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
