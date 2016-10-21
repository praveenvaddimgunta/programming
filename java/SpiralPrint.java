class SpiralPrint{
	public static void main(String[] args) {
		int m=3, n=4;
		int[][] a= new int[][] 
					{{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12}};

		int i, k = 0, l = 0;

		for(int ff = 0; ff<m; ff++){
			for(int kk=0; kk<n; kk++){
				System.out.print(a[ff][kk]+",");
			}
			System.out.println();
		}
	/* k - starting row index
		m - ending row index
		l - starting column index
		n - ending column index
		i - iterator
	*/

		while(k<m && l<n){
			/* Print the first row from the remaining rows */
		for (i = l; i < n; ++i){
			System.out.print(a[k][i]+",");
		}
		k++;

		/* Print the last column from the remaining columns */
		for (i = k; i < m; ++i)	{
			System.out.print(a[i][n-1]+",");
		}
		n--;

		/* Print the last row from the remaining rows */
		if ( k < m)	{
			for (i = n-1; i >= l; --i){
				System.out.print(a[m-1][i]+",");
			}
			m--;
		}

		/* Print the first column from the remaining columns */
		if (l < n){
			for (i = m-1; i >= k; --i){
				System.out.print(a[i][l]+",");
			}
			l++;
		}
	}
	}
}