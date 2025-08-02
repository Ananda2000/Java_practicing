// HERE WE ARE EXPLAINING THE 2-D ARRAY...

package arrays;

public class Arrays_2D_array {
	public static void main(String[] args) {
		int[][] d_2Darray = new int[2][2];

		// BELOW ARE INITIALIZING THE ARRAY VALUES.. FOR 2-D ARRAY..
		d_2Darray[0][0] = 1;
		d_2Darray[0][1] = 2;
		d_2Darray[1][0] = 3;
		d_2Darray[1][1] = 4;
		int z = d_2Darray.length;
		int x = d_2Darray[0].length;

		System.out.println("----DISPLAY OF 2-D ARRAY -----");
		for (int i = 0; i < z; i++)
			for (int j = 0; j < x; j++) {
				System.out.println(d_2Darray[i][j]);
			}
	}

}
