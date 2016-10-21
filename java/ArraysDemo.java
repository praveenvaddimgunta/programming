import java.util.*;
class ArraysDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		String[] arr = l.split(" ");
		System.out.println("Original Array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+",");
		}System.out.println();
		for(String i : arr){ 
			System.out.print(i+" ");
		}System.out.println();
		//CONVERSION OF ARRAY TO ARRAYLIST
		List<String> arrList = Arrays.asList(arr);
		for(int i=0; i<arrList.size(); i++){
			System.out.print(arrList[i]+",");
		}System.out.println();
	}
}