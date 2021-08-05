import java.util.*;


public class rockpaperscissors {

   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your choice from stone,paper,scissors : ");
    String user_choice=sc.nextLine();
    String game []={"stone","paper","scissors"};
    double num=Math.random()*3;
    String computer_choice=game[(int)num];
    System.out.println("your choice is "+user_choice);

   System.out.println("computer choice is "+computer_choice);



    if(user_choice.equals("stone") && computer_choice.equals("scissors")){
        System.out.println("you win the match");
    }
    else if(user_choice.equals("paper") && computer_choice.equals("stone")){
        System.out.println("you win the match");
    }
    else if(user_choice.equals("scissors") && computer_choice.equals("paper")){
        System.out.println("you win  the match");
    }
    else if(user_choice.equals(computer_choice)){
        System.out.println("match tie");
    }
    else{
        System.out.println("computer win the match");
    }











       
   }
    
}
