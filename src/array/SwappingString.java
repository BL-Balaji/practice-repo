package array;

public class SwappingString {
    public static void main(String[] args) {
        String s1 = "Balaji";
        String s2 = " Nivrutti";
        s1 = s1+s2;   // BalajiNivrutti
        s2 = s1.substring(0,s2.length()-s1.length());
        s1 = s1.substring(s1.length() - s2.length());


    }
}
