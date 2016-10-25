import java.util.*;
class NthPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prime = 0;

		if(n==1)System.out.println(2);
		else if(n==2)System.out.println(3);
		else{
			int number = 3;
			prime = 2;
			while(prime<n){
				boolean flag = true;
				number = number+2;
				int root = (int)Math.sqrt(number);
				for(int i=3; i<=root; i++){
					if(number%i==0){
						flag = false;
					}
				}
				if(flag){
					prime = prime+1;
				}
			}
			System.out.println(number);
		}
	}
}