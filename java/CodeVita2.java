import java.util.*;
class aaa{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long k = sc.nextInt();
		long combinations=0;
		for(long num=0; num<=k; num=num+2){
			long s = n-num;
			long p = aaa.fact(n);
			long q = aaa.fact(s);
			long r = aaa.fact(num);
			// System.out.println(q);			
			combinations = combinations + (p/(q*r));
		}
		System.out.println(combinations);

	}
	static long fact(long n){
		if(n==1||n==0) return 1;
		else return n*fact(n-1);
	}
}