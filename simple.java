package FUNCTION;


import java.util.*;
class simple
{
    int p,r,t,si;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.print("Enter p: ");
        p=sc.nextInt();
        System.out.print("Enter r: ");
        r=sc.nextInt();
        System.out.print("Enter t: ");
        t=sc.nextInt();
    }
    void simp()
    {
        si=(p*r*t)/100;
        System.out.print("Simple interest: "+si);
    }
    public static void main(String args[])
    {
        simple s=new simple();
        s.input();
        s.simp();
    }
}