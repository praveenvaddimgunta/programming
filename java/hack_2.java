import java.util.*;
class hack_2{
	public static void main(String[] args) {
		int n=6;
		int[][] input = new int[n][n];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++){
			String line = sc.nextLine();
			String[] mat = line.split(" ");
			for(int j=0; j<n; j++) {
				input[i][j] = Integer.parseInt(mat[j]);
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(input[i][j]+" ");
			}System.out.println();
		}
	}
}