import java.util.Scanner;
public class narcissist_num {
public static int countDigits(int n){
        if(n < 10) return 1;

        return (countDigits(n/10)+1);
    }

    public static double sumNarcissist(int n, int digits){
        if(n == 0) return 0;

        else{
            return(sumNarcissist(n/10, digits)+(Math.pow(n%10,digits)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  =  sc.nextInt();

        int digits = countDigits(n);
        System.out.println("There are : "+ digits + " digits.");

        double sum = sumNarcissist(n, digits);
        if(sum == n){
            System.out.println("It is a narcissist number.");
        }
        else{
            System.out.println("Not narcissist.");
        }
    }
}
