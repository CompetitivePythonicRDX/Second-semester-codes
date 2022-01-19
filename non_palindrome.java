import java.util.Scanner;

public class non_palindrome {
    static String isPalindromeWord(String word){
        int len = word.length();
        for(int i = 0; i < len/2; i++){
            if(word.charAt(i) != word.charAt(len-1-i)){
                return "It is not palindrome to begin with";
            }
        }
        //If the word is palindrome add the coresponding letter of the last letter in the end of the word
        char ch = word.charAt(len-1);
        word = word + ch++;
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String checker = isPalindromeWord(str);
        System.out.println(checker);
        sc.close();
    }
}
