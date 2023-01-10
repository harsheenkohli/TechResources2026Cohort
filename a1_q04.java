import java.util.*;
public class a1_q04
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the lower limit : ");
        int low = sc.nextInt();
        System.out.println ("Enter the upper limit : ");
        int high = sc.nextInt();
        System.out.println("Prime numbers from "+ low +" to "+ high +" are :");
        for (int i=low; i<=high; i++)
        {
            int counter = 1;
            for (int j = 2; j<=i; j++)
            {
                if (i%j==0)
                    counter++;
                if (counter >2)
                    break;   
            }
            if (counter==2)
                System.out.println(i);
        }
    }
}
