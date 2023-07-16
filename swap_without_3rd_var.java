package BASICS;


import java.io.*;
class swap_without_3rd_var
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        DataInputStream r=new DataInputStream(System.in);
        a=Integer.parseInt(r.readLine());
        b=Integer.parseInt(r.readLine());
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
