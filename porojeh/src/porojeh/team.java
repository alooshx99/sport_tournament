package porojeh;
import java.util.Scanner;

public class team {
private Scanner input = new Scanner(System.in);

private String tname;
private int tnum;
	
	private player[] playernums=new player[11];
	private couch couchinfo = new couch();
	
	public void read() {
		System.out.println("Enter team name: ");
		tname = input.next();
		System.out.println("Enter team number: ");
		tnum = input.nextInt();
		
		
		couchinfo.read();
		
		
		for(int i = 0 ;i<11;i++) {
			playernums[i] = new player();
			playernums[i].read();
		}
		
		
	}
	
	public void show() {
		System.out.println(tname);
		
		System.out.println(tnum);
		
		couchinfo.show();
		
		for(int i = 0 ;i<11;i++) {
			playernums[i].show();
		}
		
		
	}
	
	public int get_tnum() {return tnum;}
	public String get_tname() {return tname;}
	
	
	public void checktnum(int a) {
		if(a==get_tnum()) {
			System.out.println(tname);
			
			System.out.println(tnum);
			
			couchinfo.show();
			
			for(int i = 0 ;i<11;i++) {
				playernums[i].show();}
		}

	}
	
	
	public void checktname(String a) {
		if(a==get_tname()) {
			System.out.println(couchinfo.cohdetail.get_name());
		}
		
	}
	
	public void checkcouchid(int a) {
		if(a==couchinfo.cohdetail.get_nid()) {
			System.out.println(tname);
		}
	}
	
	
	public void checkplayerid(int a) {
		for(int i = 0 ;i<11;i++) {
			if(a==playernums[i].perdetail.get_nid()) {
				System.out.println(tname);
		}
		
	}
	
}
	
	
	public void checkplayerages() {
		for(int i = 0 ;i<11;i++) {
			if(((1402)-playernums[i].perdetail.dob.get_y())>30) {
				System.out.println(playernums[i].perdetail.get_name()+" "+playernums[i].perdetail.get_lname());
			}
		}
	}
	
	
	
	
	
}