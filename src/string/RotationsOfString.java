package string;

public class RotationsOfString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        String str3 = str1 + str1; //ABCDABCD  ----> CDAB
        if(str1.length() ==  str2.length())
        {
            if(str3.contains(str2))
            {
                System.out.println("Both two string are rotational of each other");
            }else{
                System.out.println("Not Rotational");
            }
        }
    }
}
