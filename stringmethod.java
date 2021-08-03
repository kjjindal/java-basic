
class string_method{
    public static void main(String[] arg){
        String name ="kalpit";
        System.out.println(name);

        System.out.print("name length is : ");
        int name_length=name.length();
        System.out.println(name_length);
        
        System.out.print("name in lower : ");
        String name_lower=name.toLowerCase();
        System.out.println(name_lower);

        System.out.print("name in upper : ");
        String name_uppper=name.toUpperCase();
        System.out.println(name_uppper);

        System.out.print("name in trim : ");
        String nottrimmed_name="      kalpit   ";
        String trimmed_name=nottrimmed_name.trim();
        System.out.println(trimmed_name);


        // index start with 0
        System.out.print("char from index 2 is  : ");    
        String name_sub=name.substring(2);
        System.out.println(name_sub);    


        System.out.print("char from index 1 to 5  : ");    
        String name_special=name.substring(1,6);    // it means takes value  those index value is start from 1,2,3,4,5 means 6 is excluded
        System.out.println(name_special);  

        System.out.print("replace kalpit with tushar : ");    
        String name_replace=name.replace("kalpit","tushar");
        System.out.println(name_replace);  


        System.out.print("check string start with ka or not  : ");    
        System.out.println(name.startsWith("ka"));  

        System.out.print("check string end with it or not  : ");    
        System.out.println(name.endsWith("it"));  

        System.out.print("find char at special position ");    
        System.out.println(name.charAt(1));     // index start with 0


        System.out.print("find index of any char : ");      // gives first accurance
        System.out.println(name.indexOf("lp"));  

        System.out.print("find index of any char : ");    
        System.out.println(name.indexOf("i",2));    // start with index 2 

        System.out.print("find last index of any char : ");       // gives last accurance
        System.out.println(name.lastIndexOf("lp"));  


        System.out.print("check given string is equal to or not :");    
        System.out.println(name.equals("kalpit"));  

        System.out.print("check given string is equal to or not with case  : ");    
        System.out.println(name.equals("kalpot"));  

        System.out.print("check given string is equal to or not  without any case ");    
        System.out.println(name.equalsIgnoreCase("KalPit"));  

        System.out.print("escape sequences with \"quotes\" ");    
  

    








    }
}