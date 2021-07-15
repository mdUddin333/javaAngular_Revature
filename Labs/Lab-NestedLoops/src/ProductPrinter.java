
public class ProductPrinter {

	public static void main(String[] args) {


		int[] arr1= {1,2,3,4,5,6,7,8,9};
		int[] arr2= {10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println(arr1[i]*arr2[j]);
			}
		}
		
	}

}
