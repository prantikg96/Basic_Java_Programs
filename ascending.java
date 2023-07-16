package BASICS;

import java.util.*;
class ascending
{
    public static void main(String[] args)
    {
    int i,n,n1,s;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a no.: ");
    n=sc.nextInt();
    s=0;
    for(i=0;i<=9;i++)
    {
        n1=n;
        while(n1>0)
        {
            if(n1%10==i)
            {
                s=(s*10)+i;
            }
            n1=n1/10;
        }
    }
    System.out.println(s);
    }
}