package porojeh;

import java.util.Scanner;

public class date {
private Scanner input = new Scanner(System.in);
	
	private int y;
	private int m;
	private int d;
	
	public void read() {
		System.out.println("Enter Year: ");
		y = input.nextInt();
		System.out.println("Enter Month: ");
		m = input.nextInt();
		System.out.println("Enter Day: ");
		d = input.nextInt();
	}
	
	public int get_y() {return y;}
	public int get_m() {return m;}
	public int get_d() {return d;}
	
	public void show(){
		System.out.println(y+"/"+m+"/"+d);
	}
	
}
