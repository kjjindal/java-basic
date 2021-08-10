import java.util.*;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number for factorial :");
    
        int factorial_number=sc.nextInt();
        int factorial_result=1;


        for(int i=factorial_number;i>0;i--){

            factorial_result=factorial_result*i;

        }

        System.out.println("factotial is "+factorial_result);
        
    }
    
}
