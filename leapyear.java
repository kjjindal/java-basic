import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year here :");
        int year=sc.nextInt();

         // first mehtod to check leap year
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                System.out.println("year is leap year");
                }
                else{
                    System.out.print("year is not leap year");
                }
            }
            else{
                System.out.println("year is leap year");
            }
        }
        else{
            System.out.print("year is not leap year");

        }

        // second method  foe check leap year
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.print("year is leap year");

        }
        else{
            System.out.print("year is not a leap year");

        }
    }
}
