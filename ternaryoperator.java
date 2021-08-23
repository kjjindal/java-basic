package third;
import java.util.*;

public class TernaryOperator {
	
	public static void main(String[] args) {
		// ternary operator is used to prevent from if and else keyword and use for low coding(less line of code)
		
		// example 1
		
//		int age=15;
//		String permission=age>=18?"Yes ,you have permission to drive":"No,you are young";
//		System.out.println(permission);
		
		// now we takes input from user
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter your age here : ");
//		int age=sc.nextInt();
//		String permission=age>=18?"Yes ,you have permission to drive":"No,you are young";
//		System.out.println(permission);
		
		
		//example 2
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your channel name : ");
		String channel=sc.nextLine();
		// this is because in java for compare two string we use equals method instead of ==
//		String result=channel=="catch error"?"Do subscribe and like the videos":"Do not subscribe";
		String result=channel.equals("catch error")?"Do subscribe and like the videos":"Do not subscribe";
		System.out.println(result);
		
		
		System.out.print("Thanks for watching my videos please do subscribe the channel and like the videos and share the videos");
		
		
	
		
		
		
		
	}
	

}
