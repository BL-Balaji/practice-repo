package array;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        String revseseStr = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            revseseStr = revseseStr + str.charAt(i);
        }
        if(str.equals(revseseStr))
        {
            System.out.println("Palindrome String");
        }else{
            System.out.println("NOT Palindrome string");
        }
    }
}
