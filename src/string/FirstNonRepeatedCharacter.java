// Write a program to find the first non-repeated character in a string.

package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static Character findNonRepeatedChar(String str)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entryMap : map.entrySet())
        {
            if(entryMap.getValue() == 1)
            {
                return entryMap.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.next();

        System.out.println("first non repeating character : "+findNonRepeatedChar(str));

    }
}
