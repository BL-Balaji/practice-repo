package array;

public class CountTheNumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "hello";
        str = str.toLowerCase();
        int vowelCount =0;
        int consonantsCount =0;
        for(char a : str.toCharArray())
        {
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            {
                vowelCount++;
            }else {
                consonantsCount++;
            }
        }
        System.out.println("Vowels : "+vowelCount+" Consonants : "+consonantsCount);
    }
}
