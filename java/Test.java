import java.io.*;
import java.util.*;
class Test {
    int a, b;
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Test t1 = new Test();
        t1.input(a,b);
        t1.output();
        Test t2 = new Test();
        t2.assign(t2);
        t2.output();
    }
    void input(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void output()
    {
        System.out.println("Value of a: " +a);
        System.out.println("Value of b: " +b);
    }
    void assign(Test t)
    {
        a = t.a;
        b = t.b;
    }
}