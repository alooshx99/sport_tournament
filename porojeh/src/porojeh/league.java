package porojeh;

public class league {
	
	private team[] teamnum;
	
	public void read() {
		
		for(int i = 0;i<16;i++) {
			teamnum[i]= new team();
			teamnum[i].read();
		}
			
	}
	
	public void show() {
		
		for(int i = 0;i<16;i++) {
		
			teamnum[i].show();
		}
}
	
}