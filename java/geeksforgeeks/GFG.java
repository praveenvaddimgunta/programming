import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int numTest = Integer.parseInt(sc.nextLine());
    	for(int i=0; i<numTest; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(sc.nextLine(),"");
            int k=0;
            while(st.hasMoreTokens()){
            	arr[k++]=Integer.parseInt(st.nextToken());
            }
            for(int j=1; j<n; j++){
            	if(arr[j-1]<arr[j]){
            		int temp = arr[j-1];
            		arr[j-1]=arr[j];
            		arr[j]=temp;
            	}
            }
           	for(int f=0; f<n; f++) System.out.print(arr[f]);
            int j=0;
            if(n%2==0){
            	while(j<n){
            		j=j+2;
            	}
            }else{

            }
    	}
	}
}