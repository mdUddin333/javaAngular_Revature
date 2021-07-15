
public class OverloadedMethods {

	public static void main(String[] args) {


		OverloadedMethods om=new OverloadedMethods();
		
		om.print();
		om.print("This is a method overloading");
		om.print("sceond", "third");
	}

	public void print() {
		System.out.println("Original print method");
	}
	public void print(String str) {
		System.out.println(str);
	}
	public void print(String str1,String str2) {
		System.out.println(str1+" "+str2);
	}
}
