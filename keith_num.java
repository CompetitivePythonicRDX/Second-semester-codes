// Java program to check if a number is Keith or not
import java.util.*;

class keith_num{
// Returns true if x is Keith, else false.
static boolean isKeith(int x)
{
    // Store all digits of x in a vector "terms"
    // Also find number of digits and store in "n".
    ArrayList<Integer> terms=new ArrayList<Integer>();
    int temp = x, n = 0; // n is number of digits in x
    while (temp > 0)
    {
        terms.add(temp%10);
        temp = temp/10;
        n++;
    }

    // To get digits in right order (from MSB to
    // LSB)
    Collections.reverse(terms);

    // Keep finding next trms of a sequence generated
    // using digits of x until we either reach x or a
    // number greate than x
    int next_term = 0, i = n;
    while (next_term < x)
    {
        next_term = 0;

        // Next term is sum of previous n terms
        for (int j=1; j<=n; j++)
            next_term += terms.get(i-j);

        terms.add(next_term);
        i++;
    }

    return (next_term == x);
}

// Driver program
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if (isKeith(n))
System.out.println("Yes");
else 
System.out.println("No");

sc.close();
}
}
// this code is contributed by mits
