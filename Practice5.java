// wrt multiplication table in reverse order

import java.util.*;

public class Practice5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number for table :");
    
        int table_number=sc.nextInt();
        int n=10;
        int i;


        for(i=10;i>0;i--){
            System.out.println(table_number+" X "+i+" = "+table_number*i);
        }
    
    


        


    }
    
}
