import java.util.Scanner;
public class Overloading {

	public static void main(String[] args) {
		
		System.out.println("What's your name? ");
		
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		name(num);
		
		System.out.println("What's your ID? ");
		String id = input.nextLine();
		ID(id);
		
		System.out.println("What's your major? ");
		String maj = input.nextLine();
		
		System.out.println();
		info(num , id , maj);
				
	}
	public static void name(String name) {
		System.out.println("Your name is " + name);
	}
	
	public static String ID(String ID) {
		System.out.println("Your ID is " + ID);
		return ID;
	}
	
	public static void major(String maj) {
		System.out.println("Your major is " + maj);
	}
	
	public static void info(String name , String ID , String maj) {
		
		System.out.println("Your name is " + name + ", your id is " + ID + ", your major is " + maj);
	}
}
