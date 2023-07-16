package BASICS;


import java.util.*;
class digit_pattern
{
    public static void main(String args[])
    {
        int n,i,c,j,x,n1,s,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        n=sc.nextInt();
        n1=n;
        c=0;
        while(n1>0)
        {
            c++;
            n1=n1/10;
        }
        s=0;
        while(n>0)
        {
            k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        for(i=1;i<=c;i++)
        {
            x=s;
            for(j=1;j<=i;j++)
            {
                System.out.print(x%10);
                x=x/10;
            }
            System.out.println(" ");
        }
    }
}