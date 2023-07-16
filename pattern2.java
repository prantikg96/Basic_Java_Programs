package FUNCTION;


import java.util.*;
class pattern2
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
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        pattern2 x=new pattern2();
        x.input();
        x.pat();
    }
}