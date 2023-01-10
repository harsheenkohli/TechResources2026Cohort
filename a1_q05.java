import java.util.*;
public class a1_q05
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a number to check for number of digits : ");
        int n = sc.nextInt();
        int temp = n;
        int counter = 0;
        while (temp!=0)
        {
            counter++;
            temp/=10;
        } 
        if (counter==0)
            System.out.println("The number of digits in "+ n + " are 1."); 
        else
            System.out.println("The number of digits in "+ n + " are "+ counter+ ".");     
    }
}
