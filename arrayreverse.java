package third;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		// array reverse in java 
		// 2 methods
		
		
//		methods  1
		
		int marks[]= {15,16,17,18,19};
		int marks2[]=new int [marks.length];   // empty marks2 array
		
		for(int i=marks.length-1;i>=0;i--) {
			marks2[marks.length-1-i]=marks[i];
		}
		
		for(int element:marks2) {
			System.out.print(element+" ");
			
		}
		System.out.println();
		System.out.println("reverse successfully using first method");
		
		// second method using temp variable
		
		int arr []= {28,29,30,31,32,33};
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
		}
		
		for(int element2:arr) {
			System.out.print(element2+" ");
		}
		System.out.println();
		System.out.println("array reverse successfully by using another variable");
		
		System.out.println("Thanks for watching my videos and do subscribe the channel and share ");
		
		
		
		
		
		
	}

}
