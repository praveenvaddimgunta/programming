import java.util.*;
class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = fact(number);
		System.out.println(factorial);
	}
	public static int fact(int n){
		if(n==0||n==1){
			return 1;
		}else {
			return n*fact(n-1);
		}	
	}
}