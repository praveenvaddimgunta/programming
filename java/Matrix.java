import java.util.*;
class Matrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().split(" ");
		int row = Integer.parseInt(line[0]);
		int coloum = Integer.parseInt(line[1]);
		int[] arr = new int[n*n];
		for(int i=0; i<n*n;i++){
			arr[i]=i;
		}
		int[][] mat = new int[2*n-1][n];

		for(int i=0;i<2*n-1;i++){
			for(int j=0; j<n;j++){
				if(j>i){
					mat[i][j]=-1;
				}else {
					mat[i][j]=arr[i+j];
				}
			}
		}

		for(int i=0;i<2*n-1;i++){
			for(int j=0; j<n;j++){
			System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

		
		if(coloum>n-1 || row>(2*n-1) || coloum>row) {
			System.out.println("-1");
		}else{
			if(row<n){

			}
		}
	}
}