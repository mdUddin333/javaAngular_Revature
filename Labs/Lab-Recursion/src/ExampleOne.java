
public class ExampleOne {

	public static void main(String[] args) {

		
		int input=5;
		ExampleOne ex=new ExampleOne();
		
		System.out.println(ex.fibonacci(input));
	}

	public int fibonacci(int num) {
			
			if(num <= 0) return 0;
			if(num == 1) return 1;
			
			return num * fibonacci(num-1);
		}
}
