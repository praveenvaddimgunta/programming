import java.util.*;

class AmstrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n=0, sum=0, reminder=0;
		int input = number;			//to check the length we need to assign it to another vaiable
		// System.out.println(number);
		while(input!=0){
			input = input/10;    //to know the number of digits in given integer
			n++;
		}

		// System.out.println(number);
		while(number!=0){
			reminder = number%10;
			sum = sum+(int)Math.pow(reminder,n);
			number = number/10;
		}

		// System.out.println(sum);

		if(sum == number) {
			System.out.println("the given number is AmstrongNumber");
		}else {
			System.out.println("this is not an AmstrongNumber");
		}
	}
}