package porojeh;

import java.util.Scanner;

public class person {
	private Scanner input = new Scanner(System.in);

	private String name;
	private String lname;
	private int nid;
	protected date dob = new date();
	
	public void read() {
		System.out.println("Enter name: ");
		name = input.next();
		System.out.println("Enter last name: ");
		lname = input.next();
		System.out.println("Enter number id: ");
		nid = input.nextInt();
		
		dob.read();
	}
	
	public String get_name() {return name;}
	public String get_lname() {return lname;}
	public int get_nid() {return nid;}
	
	public void show(){
		System.out.println(name+" , "+lname+" , "+nid);
		dob.show();
		
	}
}
