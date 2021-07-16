
public class Ball {
	String size;
	String color;
	public static void main(String[] args) {

		Ball b1=new Ball();
		Ball b2=new Ball();
		
		b1.size="Small";
		b1.color="Green";
		
		b2.size="Big";
		b2.color="Blue";
		
		b1.bounce();
		b2.bounce();
	}

	public void bounce() {
		System.out.println("The "+size+" "+color+" ball is bouncing");
	}
}
