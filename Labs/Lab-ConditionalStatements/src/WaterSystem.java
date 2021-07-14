
public class WaterSystem {

	public static void main(String[] args) {
	
		int precipition =0;
		int waterOutput=0;
		int temperature=80;
		
		if(precipition<20) {
			
			if(temperature<=75) {
				waterOutput=30;
			}else {
				waterOutput=45;
			}
		}else if(precipition<31) {
			
			if(temperature<=75) {
				waterOutput=10;
			}else {
				waterOutput=25;
			}
		}else if(precipition<56) {
			
			if (temperature<=75) {
				waterOutput=0;
			}else {
				waterOutput=15;
			}	
		}else {
			waterOutput=0;

		}
		System.out.println("The water output should be "+waterOutput);
	}

}
