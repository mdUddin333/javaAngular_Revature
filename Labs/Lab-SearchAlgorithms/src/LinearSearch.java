
public class LinearSearch {

	public static void main(String[] args) {

		char letter='0';
		//char[] letters= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] letters=null;
		
		LinearSearch ls=new LinearSearch();
		System.out.println(ls.findIndex(letter, letters));
	
	}
	public static int findIndex(char target,char[] data) {
		if(data==null) return -1;
		int result=-1;
		
		for(int i=0;i<data.length;i++) {
			char temp=data[i];
			if(temp==target) {
				return i;
			}
		}
		
		return result;
	}
}
