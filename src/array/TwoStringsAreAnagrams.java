package array;

import java.util.Arrays;

public class TwoStringsAreAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

//        if(str1.length() == str2.length())
//        {
//            isAnagram = true
//        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length())
        {
            System.out.println("Both two string NOT anagram");
            return;
        }
        char[] str1CharArray1 = str1.toCharArray();
        char[] str2CharArray2 = str2.toCharArray();
        Arrays.sort(str1CharArray1);
        Arrays.sort(str2CharArray2);
        boolean isAnagram = Arrays.equals(str1CharArray1, str2CharArray2);
        if(isAnagram)
        {
            System.out.println("two string are anagram");
        }else{
            System.out.println("two string are not anagram");
        }
    }
}
