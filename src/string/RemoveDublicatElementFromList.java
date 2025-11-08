package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicatElementFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,20,30);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
