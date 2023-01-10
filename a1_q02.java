import java.util.*;
public class a1_q02
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the marks of the student (out of 100): ");
        int marks = sc.nextInt();
        if (marks>100 || marks<0)
            System.out.println("Invalid input.");
        else if (marks>=90)
            System.out.println("Excellent!");
        else if (marks>=80)
            System.out.println("Good!");
        else if (marks>=70)
            System.out.println("Fair!");
        else if (marks>=60)
            System.out.println("Meets expectations!");
        else
            System.out.println("Below par.");
    }
}
