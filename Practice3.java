// wrt a program  which sum all n even numbers

public class Practice3 {

    public static void main(String[] args) {

        int count=0;
        int n=5;
        int sum=0;
        int i=0;


        while(count<n){

            if(i%2==0){
                sum+=i;
                count++;
            }
            i++;   
        }

        System.out.println(sum);  
    }
    
}
