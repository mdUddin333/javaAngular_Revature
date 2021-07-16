
public class Constructors {

	
	public Constructors(int value) {
		System.out.println(value);
	}
	public Constructors() {
		System.out.println("This is a no args Constructors");
	}
	public static void main(String[] args) {
		Constructors con=new Constructors(520);
		
		Constructors con1=new Constructors();
		
	}

}
