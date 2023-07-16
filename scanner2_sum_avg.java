package BASICS;
import java.util.*;
class scanner2_sum_avg
{
    public static void main(String args[])
    {
        int n1,n2,n3,s,avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1:");
        n1=sc.nextInt();
        System.out.print("Enter n2:");
        n2=sc.nextInt();
        System.out.print("Enter n3:");
        n3=sc.nextInt();
        s=n1+n2+n3;
        avg=(n1+n2+n3)/3;
        System.out.println("Sum="+s);
        System.out.println("Average="+avg);
    }
}