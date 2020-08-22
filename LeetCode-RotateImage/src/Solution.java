class Solution {
	public static void main(String[] args) {
		
		int[][] input =
				
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		rotate(input);
	}
		
		
		
    public static void rotate(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = x; y < matrix.length; y++) {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
        
        //We need to flip matrix horizontally
        
        for(int[] r : matrix) {
        	int L = 0;
        	int R = r.length-1;
        	
        	while(L<R) {
        		swap(r, L, R);
        		L++;
        		R--;
        	}
        }
        
        //Print
        /**
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
            	System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        **/

    }
    
    public static void swap(int[] row, int first, int last) {
    	int temp = row[first];
    	row[first]=row[last];
    	row[last] = temp;
    }

}