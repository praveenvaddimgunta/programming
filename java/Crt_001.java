import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Crt_001 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        Stack<String> stack= new Stack<String>();
        int[] countArr = new int[size];
        int count=0;
        for(int i=0; i<input.length; i++){
            if(input[i].equals("1")){
                stack.push(input[i]);
                count++;
            }else{
                stack.pop();
                count--;
            }
            countArr[i]=count;
        }
        int max = countArr[0];
        for(int i=1; i<size; i++){
            if(max<countArr[i]) {
                max=countArr[i];
            }
        }
        System.out.println(max);
    }
}