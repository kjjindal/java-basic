public class conditionals {

    public static void main(String[] arg) {
 
        int age=18;

        // ==,>,>=,<,<=,!=    relational operator
        if(age>=18){
            System.out.println("Yes ,you are eligible for driving license");
        }
        else{
            System.out.println("No,you are not eligible for driving license");
        }


        // logical operator
        int age2=25;
        String gender="male";
         // and operator if both cases are true then it true otherwise it is false
        if(age2>20 && gender=="male"){
            System.out.println("yes, you can drive");

        }
        else{
            System.out.println("no,you can not drive");
        }

         // or || operator if one of cases is true then it is true
        if(age2>20 || gender=="female"){
            System.out.println("yes, you can drive");

        }
        else{
            System.out.println("no,you can not drive");
        }
         


        // not logical operator convert true--> false and false ---> true

        boolean a=true;
        boolean b=false;

        System.out.print("not of a is :");
        System.out.println(!a);

        System.out.print("not of b is :");
        System.out.println(!b);




        
    }
    
}
