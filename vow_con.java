import java.util.*;
public class vow_con {

    static void Check(String word){
        // Function to check string and print the words that begin with a vowel and end with a consonant.
        int len = word.length();
        char ch = word.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            if(len > 1){
                char ch1 = word.charAt(len-1);
                if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u'){
                    System.out.println(word);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Extract each word of the sentence
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            Check(words[i]);
        }
sc.close();
    }
}
