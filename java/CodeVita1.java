import java.util.*;
import java.text.*;
class CodeVita1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int elements= size*(size+1)/2;
		int count=0, sum=0;
		String[] arr = new String[elements];
		for(int i=3,j=0; i<420; i++,j++){
			if(count!=elements){
				sum = i*(i+1)/2;
				i=i+3;
				count++;
				DecimalFormat formatter = new DecimalFormat("00000");
				String s = formatter.format(sum);
				arr[j]=s;
			}else{
				break;
			}			
		}
		int	index = 0;
		for(int i=1; i <= size && index < elements; i++){
			for(int j=0; j < (size-i) ; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print(arr[index++] +" ");
				if(index >= elements){
				break; 
			}
		}
		System.out.println();
		}
	}
}