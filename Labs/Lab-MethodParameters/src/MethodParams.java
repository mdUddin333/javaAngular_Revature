
public class MethodParams {

	public static void main(String[] args) {


		MethodParams mp=new MethodParams();
		double d=mp.convertIntToDouble(20);
		System.out.println(d);
		// SUM method here
		System.out.println(mp.sum(10, 20, 30));
	}

	
	public double convertIntToDouble(int num) {
		
		return (double)num;
	}
public double sum(int num,int num2,int num3) {
		
		return num+num2+num3;
	}
	
}
