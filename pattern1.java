package FUNCTION;


import java.util.*;
class pattern1
{
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter a no.: ");
        n=sc.nextInt();
    }
    void pat()
    {
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        pattern1 x=new pattern1();
        x.input();
        x.pat();
    }
}