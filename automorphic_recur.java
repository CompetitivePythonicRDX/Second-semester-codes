import java.util.Scanner; // Including scanner class from utility package
public class automorphic_recur {//Class Declaration
    static int check_AutomorphicNumber(int num)//Method to check if the number is automorphic or not
    {
        int s=num*num;//Storing the square of the number
       if(num>0)//base case
       {
           if(num%10 != s%10)//Inner base case to check if the digits are matching or not
             {
               return -1;//In case the number is not automorphic
             }
             else//Recursive case
                 check_AutomorphicNumber(num/10);
                return 0;
       }
       return 0;//Return 0 if the number is lesser than 9
    }
    //Driver code
    public static void main(String[] args) {//Main method
        Scanner sc=new Scanner(System.in);//Scnner object built
        int num;//Integer variablw declared
        System.out.print("Enter a number:");
        num=sc.nextInt();//variable given by the user
        if(check_AutomorphicNumber(num)==0)//Checking if 0 has been returned by calling the function
            System.out.print("It is an Automorphic Number.");
           else//Else case, i.e. to be printed if the number is not automorphic
               System.out.print("It is not an Automorphic Number.");
        sc.close();//Closing the scanner instance
    }
}