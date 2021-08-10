// wrt a program for table for n number

import java.util.*;

public class Practice4 {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a number for table :");

    int table_number=sc.nextInt();
    int n=10;
    int i=1;

    while(i<=n){
        System.out.println(table_number+" X "+i+" = "+table_number*i);
        i++;
    }


        
    }
    
}
