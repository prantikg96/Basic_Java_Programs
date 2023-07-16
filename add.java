package BASICS;


import java.io.*;
class add
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(r.readLine());
        b=Integer.parseInt(r.readLine());
        c=a+b;
        System.out.print(c);
    }
}
