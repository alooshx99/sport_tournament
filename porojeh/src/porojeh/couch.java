package porojeh;

import java.util.Scanner;

public class couch {
	private Scanner input = new Scanner(System.in);
	
private String grade;
	
	protected person cohdetail = new person();
	
	public void read() {
		System.out.println("Couch info");
		cohdetail.read();
		System.out.println("Enter couch grade: ");
		grade = input.next();
		
	}
	
	public void show() {
		cohdetail.show();
		System.out.println("couch grade: "+grade);
}
}