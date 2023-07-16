package FUNCTION;


import java.util.*;
class sum
{
    int x,y,z;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter x: ");
        x=sc.nextInt();
        System.out.print("Enter y: ");
        y=sc.nextInt();
    }
    void sum1()
    {
        z=x+y;
        System.out.print("Sum: "+z);
    }
    public static void main(String args[])
    {
        sum s=new sum();
        s.input();
        s.sum1();
    }
}