
public class MultiDimensionalArrays {

	public static void main(String[] args) {
	
		int [][][] my3DArray=new int[3][3][3];
		my3DArray[0][0][0]=1;
		System.out.println(my3DArray[0][0][0]);
		
		int[][] my2DArray= {{1,5,7},{14,15,16},{22,22,24}};
		
		System.out.println(my2DArray.length);
		System.out.println(my2DArray[1][2]);
	}

}
