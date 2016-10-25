import java.util.*;
class DecimalToBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		binRec(decimal);
		// int i=0,reminder=0;
		// int[] binary=new int[10];
		// while(decimal!=0){
		// 	reminder = decimal%2;
		// 	binary[i++]=reminder;
		// 	decimal = decimal/2;
		// }
		// for(int j=binary.length-1; j>=0; j--){
		// 	System.out.print(binary[j]);
		// }
	}

	public static void binRec(int i){
		if(i == 0) return;
		binRec(i/2);
		System.out.print(i%2);
	}
}