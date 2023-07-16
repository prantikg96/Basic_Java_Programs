package BASICS;

import java.util.*;
class duck
{
    public static void main(String args[])
    {
        int n,n1,s,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        n=sc.nextInt();
        n1=n;
        k=0;
        while(n1>0)
        {
            if(n1%10==0)
            {
                k=1;
                break;
            }
            n1=n1/10;
        }
        if(n>0 && k==1)
        System.out.println("Duck");
        else
        System.out.println("Not Duck");
        sc.close();
    }
}