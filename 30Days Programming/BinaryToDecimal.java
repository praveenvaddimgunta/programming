import java.util.*;
class BinaryToDecimal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		int decimal=0, i=0;

		while(binary!=0){
			int reminder = binary%10;
			decimal = decimal + reminder*(int)Math.pow(2,i);
			binary=binary/10;
			i++;									//binary to decimal but check the given input is correct or not!!!
		}

		System.out.println(decimal);
	}
}