package porojeh;

public class mainpage {

	public static void main(String[] args) {
		
		team teams[]= new team[16];
		
		for(int i= 0;i<16;i++) {
			teams[i] =new team();
			
			
			teams[i].read();
		}
	
	for(int i= 0;i<16;i++) {
		teams[i].show();
		}

	}
		
	
		
}

