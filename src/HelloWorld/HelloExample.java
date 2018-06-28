package HelloWorld;

import java.util.Scanner;

public class HelloExample {
	
	public static void main(String[] args){
		System.out.println("Enter any number:");
		Scanner scan = new Scanner(System.in);
		int i= scan.nextInt();
		int a =i+5;
		System.out.println("The sum of "+ i +" + 5: "+ a);
	}

}
