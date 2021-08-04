 
 // when we use public then we have to use file name as well class name 
 // if we don't use public then we use any other name to declare as a class name
 
 public class practice1 {

    public static void main (String [] arg){
       // write a program to convert a string in lower case
       String name="KALPIT JINDAL";
       System.out.println(name.toLowerCase());


       // write a program to replace space with underscore 
       String fname="kalpit jindal";
       System.out.println(fname.replace(" ","_"));


       // wrt a program to replace name with your name
       String letter="Dear <|name|> , Thanks a lot !";
       System.out.println(letter.replace("<|name|>",fname));

       // wrt a program to check double and triple space has or not

       String  address="Near khalsa tent house mori  char bagh  bharatpur";
       if(address.indexOf("  ")>0){
           System.out.println("double spaces is here");
       }
       else{
        System.out.println("double spaces is not here");

       }
       if(address.indexOf("   ")>0){
           System.out.println("triple spaces is here");
       }
       else{
        System.out.println("triple spaces is not here");

       }



    //    wrt a program which convert a sentence into a letter format

    System.out.println("Dear sir,\n\tI am trying to learn java from newgen .\nThanks sir");
  //n is used to next line
  //t is used to tab 

       
    }
    
}
