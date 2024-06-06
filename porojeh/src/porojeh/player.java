package porojeh;

import java.util.Scanner;

public class player {
	private Scanner input = new Scanner(System.in);
	
	private String position;
	
	protected person perdetail = new person();
	
	public void read() {
		System.out.println("Player information: ");
		perdetail.read();
		System.out.println("Enter player position: ");
		position = input.next();
		
	}
	
	public void show() {
		perdetail.show();
		System.out.println("player position: "+position);
		
	}
}
