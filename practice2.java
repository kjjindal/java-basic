import java.util.*;

public class practice2 {

    public static void main(String[] args) {

        // wrt a program to calculate that student pass or not
        Scanner sc = new Scanner(System.in);

        byte m1, m2, m3;

        System.out.print("Enter your marks in Physics:");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry:");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Mathematics:");
        m3 = sc.nextByte();

        float total = (m1 + m2 + m3) / 3.0f;

        if (total >= 40 && m1 > 33 && m2 > 33 && m3 > 33) {
            System.out.println("you are pass in this examination");
        } else {
            System.out.println("Sorry better luck next time :) :)");
        }

        // wrt a program to calculate to tax
        System.out.print("enter your income : ");
        float income = sc.nextFloat();
        float tax = 0.0f;

        if (income <= 250000) {
            tax += 0;
        } else if (income > 250000 && income <= 500000) {
            tax = 0.05f * income;
        } else if (income > 500000 && income <= 100000) {
            tax = 0.2f * (income);
        } else {
            tax = 0.3f * (income);
        }

        System.out.println("tax pay by you will be " + tax);




        // wrt a program which show day 
        System.out.print("Enter day between 0,1,2,3,4,5,6 :");
        int day=sc.nextInt();

        switch (day) {
            case 1:
            System.out.println("day is monday");
            break;
            case 2:
            System.out.println("day is Tuesday");
            break;
            case 3:
            System.out.println("day is wednesday");
            break;
            case 4:
            System.out.println("day is thursday");
            break;
            case 5:
            System.out.println("day is friday");
            break;
            case 6:
            System.out.println("day is saturday");
            break;
            case 7:
            System.out.println("day is sunday");
            break;
            case 0:
            System.out.println("day is sunday");
            break;
        
            default:
            System.out.println("you enter a wrong day plz choose between [0,1,2,3,4,5,6,7]");
                break;
        }


        //wrt a program to check website type

        String web="www.google.com";

        if(web.endsWith(".com")){
            System.out.print("website type is commercial");

        }
        else if(web.endsWith(".org")){
            System.out.print("website type is organisation");

        }
        else if(web.endsWith(".in")){
            System.out.print("website is indian");
        }

    }

}
